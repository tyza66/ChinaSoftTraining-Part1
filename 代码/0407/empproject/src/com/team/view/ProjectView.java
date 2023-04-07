package com.team.view;

import com.team.domain.Architect;
import com.team.domain.Designer;
import com.team.domain.Programmer;
import com.team.domain.Project;
import com.team.service.ProjectService;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProjectView {
    private ProjectService proSvc = new ProjectService();
    private ArrayList<Programmer[]> allTeam = TeamView.TeamSvc.getAllTeam();
    private ArrayList<String> teamNames = new ArrayList<>(); //保存所有团队名称
    private ArrayList<Integer> assignedTeam = new ArrayList<>(); //保存已分配项目的团队的索引
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    //开发项目管理主菜单
    public void projectManageMainMenu() {
        while (true) {
            System.out.println("🔣        ~开发项目管理主菜单~        🔣");
            System.out.println("🐕1.     <项目的添加>           *");
            System.out.println("🐖2.     <项目分配开发团队>      *");
            System.out.println("🐱3.     <项目的查看>           *");
            System.out.println("🐂4.     <项目的删除>           *");
            System.out.println("🐇5.     <退出当前菜单>          *");
            System.out.print("⬇请选择：");
            switch (TSUtility.readMenuSelectionPro()) {
                case '1':
                    addProjectView();
                    break;
                case '2':
                    dealingProView();
                    break;
                case '3':
                    try {
                        TSUtility.loadSpecialEffects();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    showPro();
                    break;
                case '4':
                    delProView();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    if (TSUtility.readConfirmSelection() == 'Y') {
                        return;
                    }
                    break;
            }
        }
    }

    /*
      以下四个方法（addProjectView、dealingProView、showPro、delProView）仅供本类projectManageMainMenu()方法调用
     */
    //项目的添加交互界面
    private void addProjectView() {
        System.out.println("项目参考：--------------------------------------------");
        System.out.println("1.小米官网：开发完成类似于小米官网的web项目.");
        System.out.println("2.公益在线商场：猫宁Morning公益商城是中国公益性在线电子商城.");
        System.out.println("3.博客系统：Java博客系统，让每一个有故事的人更好的表达想法！");
        System.out.println("4.在线协作文档编辑系统：一个很常用的功能，适合小组内的文档编辑.");
        System.out.println("----------------------------------------------------");
        TSUtility.readReturn();
        System.out.println("请输入你想添加的项目编号：");
        char num = TSUtility.readMenuSelection();
        try {
            TSUtility.loadSpecialEffects();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!proSvc.addProject(num)) {
            System.out.println("该项目已添加，请勿重复添加！");
        }
    }

    //项目分配开发团队交互界面
    private void dealingProView() {
        if (proSvc.getPro().size() == 0) {
            System.out.println("没有项目，请先添加项目！");
            return;
        }
        if (!proSvc.isNotDeveloped()) {
            System.out.println("没有未被开发的项目，请先添加项目！");
            return;
        }
        if (assignedTeam.size() == allTeam.size()) {
            System.out.println("没有可分配的空闲团队！");
            return;
        }
        for (int i = 0; i < allTeam.size(); i++) {
            if (assignedTeam.contains(i)) {
                continue;
            }
            System.out.println("当前团队有人员：");
            for (Programmer p : allTeam.get(i)) {
                if (p instanceof Architect) {
                    Architect a = (Architect) p;
                    System.out.println(a + "\t架构师\t" + a.isStatus() + "\t" + a.getBonus() + "\t" + a.getStock() + "\t"
                            + a.getEquipment().getDescription());
                } else if (p instanceof Designer) {
                    Designer d = (Designer) p;
                    System.out.println(d + "\t设计师\t" + d.isStatus() + "\t" + d.getBonus() + "\t\t\t"
                            + d.getEquipment().getDescription());
                } else {
                    System.out.println(p + "\t程序员\t" + p.isStatus() + "\t\t\t\t\t" + p.getEquipment().getDescription());
                }
            }
            System.out.println("请为当前团队创建一个团队名称：");
            teamNames.add(sc.nextLine());
        }
        while (true) {
            int index = r.nextInt(allTeam.size());
            if (assignedTeam.contains(index)) {
                continue;
            }
            if (proSvc.dealingPro(allTeam.get(index), teamNames.get(index))) {
                assignedTeam.add(index);
            } else {
                return;
            }
            if (assignedTeam.size() == allTeam.size()) {
                return;
            }
        }
    }

    //项目的查看
    private void showPro() {
        ArrayList<Project> pro = proSvc.getPro();
        if (pro.size() == 0) {
            System.out.println("没有项目，请先添加！");
            return;
        }
        for (Project p : pro) {
            if (p.isStatus()) {
                System.out.println("项目【" + p.getProjectName() + "】---->正在被团队【" + p.getTeamName() + "】开发中！");
            } else {
                System.out.println(p + "\n项目【" + p.getProjectName() + "】---->未被开发！");
            }
        }
    }

    //项目的删除交互界面
    private void delProView() {
        System.out.print("请输入需要删除的项目id：");
        int proId = TSUtility.readInt();
        if (proId < 1 || proId > proSvc.getPro().size()) {
            System.out.println("你输入的项目id有误，删除失败！");
            return;
        }
        if (proSvc.getPro().get(proId - 1).isStatus()) {
            System.out.println("项目正在开发中！删除失败！");
            return;
        }
        proSvc.delPro(proId);
        System.out.println("删除成功！");
    }
}
