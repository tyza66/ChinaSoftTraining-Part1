package com.team.view;

import com.team.domain.Architect;
import com.team.domain.Designer;
import com.team.domain.Employee;
import com.team.domain.Programmer;
import com.team.service.TeamException;
import com.team.service.TeamService;

import java.util.ArrayList;

public class TeamView {
    static TeamService TeamSvc = new TeamService();
    private NameListView listView = new NameListView();

    //开发团队调度管理主菜单
    public void developTeamMainMenu() {
        while (true) {
            System.out.println("※※※※※※※※※※※※※※※");
            System.out.println("※      团队调度界面      ※");
            System.out.println("※※※※※※※※※※※※※※※");
            System.out.print("1-添加团队 2-查看团队 3-删除团队 4-退出  请选择(1-4)：");
            char s = TSUtility.readMenuSelection();
            switch (s) {
                case '1':
                    addTeamView();
                    break;
                case '2':
                    allTeamShow();
                    break;
                case '3':
                    removeTeamView();
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    if (TSUtility.readConfirmSelection() == 'Y') {
                        return;
                    }
                    break;
            }
        }
    }

    /*
      以下三个方法（addTeamView、allTeamShow、removeTeamView）仅供本类developTeamMainMenu()方法调用
     */
    //添加团队功能交互界面
    private void addTeamView() {
        while (true) {
            System.out.println("------------------------开发团队调度软件------------------------");
            listView.getAllEmployeesView();
            System.out.println("-------------------------------------------------------------");
            int i = 0;
            while (i == 0) {
                System.out.print("1-团队成员列表 2-添加团队成员 3-删除团队成员 4-退出  请选择(1-4)：");
                char s = TSUtility.readMenuSelection();
                switch (s) {
                    case '1':
                        teamShowView();
                        break;
                    case '2':
                        addMemberView();
                        TSUtility.readReturn();
                        i = 1;
                        break;
                    case '3':
                        removeMemberView();
                        TSUtility.readReturn();
                        i = 1;
                        break;
                    case '4':
                        System.out.print("确认是否退出(Y/N)：");
                        if (TSUtility.readConfirmSelection() == 'Y') {
                            TeamSvc.addTeam();
                            return;
                        }
                        i = 1;
                        break;
                }
            }
        }
    }

    //团队列表展示界面（查看团队）
    private void allTeamShow() {
        ArrayList<Programmer[]> allTeam = TeamSvc.getAllTeam();
        if (allTeam.size() == 0) {
            System.out.println("没有团队，请先添加团队！");
            return;
        }
        System.out.println("--------------------团队列表--------------------");
        for (int i = 0; i < allTeam.size(); i++) {
            System.out.println("第" + (i + 1) + "个团队");
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
            System.out.println("----------------------------------------");
        }
    }

    //删除团队功能交互界面
    private void removeTeamView() {
        if (TeamSvc.getAllTeam().size() == 0) {
            System.out.println("没有团队，请先添加团队！");
            return;
        }
        System.out.print("请输入想要删除第几个团队：");
        int teamNumber = TSUtility.readInt();
        try {
            TeamSvc.removeTeam(teamNumber);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("删除成功！");
    }

    /*
      以下三个方法（teamShow、addMemberView、removeMemberView）均属于团队调度界面添加团队功能里的子交互界面；
      仅供本类addTeamView()方法调用。
     */
    //团队成员列表展示界面
    private void teamShowView() {
        Programmer[] team = TeamSvc.getTeam();
        if (team.length == 0) {
            System.out.println("当前团队中没有成员，请先添加！");
            return;
        }
        System.out.println("--------------------团队成员列表--------------------");
        teamShow(team);
        System.out.println("--------------------------------------------------");
    }

    //添加团队成员交互界面
    private void addMemberView() {
        System.out.println("--------------------添加成员--------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        Employee employee;
        try {
            employee = NameListView.listSvc.getEmployees(id);
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
            return;
        }
        try {
            TeamSvc.addMember(employee);
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
            return;
        }
        System.out.println("添加成功！");
    }

    //删除团队成员交互界面
    private void removeMemberView() {
        if (TeamSvc.getTeam().length == 0) {
            System.out.println("当前团队中没有成员，请先添加！");
            return;
        }
        System.out.println("--------------------删除成员--------------------");
        teamShow(TeamSvc.getTeam());
        System.out.print("请输入要删除的成员TID：");
        int memberId = TSUtility.readInt();
        try {
            TeamSvc.removeMember(memberId);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("删除成功！");
    }

    //当前团队成员列表（仅供本类teamShowView()、removeMemberView()方法调用）
    private void teamShow(Programmer[] team) {
        System.out.println("TID/ID\t姓名\t\t年龄\t\t工资\t\t 职位\t 奖金\t 股票");
        for (Programmer p : team) {
            if (p instanceof Architect) {
                Architect a = (Architect) p;
                System.out.println(" " + a.getMemberId() + "/" + a + "\t架构师\t" + a.getBonus() + "\t " + a.getStock());
            } else if (p instanceof Designer) {
                Designer d = (Designer) p;
                System.out.println(" " + d.getMemberId() + "/" + d + "\t设计师\t" + d.getBonus());
            } else {
                System.out.println(" " + p.getMemberId() + "/" + p + "\t程序员");
            }
        }
    }
}
