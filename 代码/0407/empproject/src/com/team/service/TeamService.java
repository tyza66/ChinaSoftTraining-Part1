package com.team.service;

import com.team.domain.Architect;
import com.team.domain.Designer;
import com.team.domain.Employee;
import com.team.domain.Programmer;
import com.team.view.TSUtility;

import java.util.ArrayList;

public class TeamService {
    private static int counter = 1; //用来为开发团队新增成员自动生成团队中的唯一ID，即memberId
    private final int MAX_MEMBER = 5; //开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER]; //用来保存当前团队中的各成员对象
    private int total = 0; //记录当前团队成员的实际人数
    private ArrayList<Programmer[]> allTeam = new ArrayList<>(); //用来保存所有团队

    //添加团队（团队调度界面添加团队功能）
    public void addTeam() {
        if (getTeam().length == 0) {
            System.out.println("你没有为当前团队添加成员，添加团队失败！");
            return;
        }
        allTeam.add(getTeam());
        team = new Programmer[MAX_MEMBER];
        total = 0;
       counter = 1;
    }

    //查看团队（团队调度界面查看团队功能）
    public ArrayList<Programmer[]> getAllTeam() {
        return allTeam;
    }

    //删除团队（团队调度界面删除团队功能(参数：待删除团队的编号；异常：没有该团队，删除失败)）
    public void removeTeam(int teamNumber) throws TeamException {
        if (teamNumber < 1 || teamNumber > allTeam.size()) {
            throw new TeamException("没有该团队，请正常输入！目前团队只有" + allTeam.size() + "个");
        } else {
            System.out.print("确认是否删除(Y/N)：");
            if (TSUtility.readConfirmSelection() == 'N') {
                throw new TeamException("请考虑清楚！");
            } else {
                for (Programmer p : allTeam.get(teamNumber - 1)) {
                    p.setStatus(true);
                }
                allTeam.remove(teamNumber - 1);
            }
        }
    }

    /*
      以下三个方法（getTeam、addMember、removeMember）均属于团队调度界面添加团队功能里的子功能
     */
    //团队成员列表（返回当前团队的所有成员对象）
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    //添加团队成员（参数：待添加成员的对象；异常：添加失败， TeamException中包含了失败原因）
    public void addMember(Employee e) throws TeamException {
        if (total == MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        } else if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        } else if (isBelongTeam(e)) {
            throw new TeamException("该员工已在本开发团队中");
        } else if (!((Programmer) e).isStatus()) {
            throw new TeamException("该员工已是某团队成员");
        } else if (isHaveArchitect(e)) {
            throw new TeamException("团队中至多只能有一名架构师");
        } else if (isHaveDesigner(e)) {
            throw new TeamException("团队中至多只能有两名设计师");
        } else if (isHaveProgrammer(e)) {
            throw new TeamException("团队中至多只能有三名程序员");
        } else {
            Programmer p = (Programmer) e;
            team[total++] = p;
            p.setMemberId(counter++);
            p.setStatus(false);
        }
    }

    //删除团队成员（参数：待删除成员的memberId；异常：找不到指定memberId的员工，删除失败）
    public void removeMember(int memberId) throws TeamException {
        if (memberId < 1 || memberId > total) {
            throw new TeamException("你输入的TID有误，删除失败！");
        } else {
            team[memberId - 1].setStatus(true);
            for (int i = memberId - 1; i < total; i++) {
                if (i == total - 1) {
                    team[i] = null;
                } else {
                    team[i] = team[i + 1];
                    team[i].setMemberId(team[i].getMemberId() - 1);
                }
            }
            total--;
            counter--;
        }
    }

    /*
      以下四个方法（isBelongTeam、isHaveArchitect、isHaveDesigner、isHaveProgrammer）仅供本类addMember方法调用
     */
    //判断待添加成员对象是否在当前团队中
    private boolean isBelongTeam(Employee e) {
        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()) {
                return true;
            }
        }
        return false;
    }

    //当待添加成员对象是架构师时，判断当前团队中是否已经有一名架构师
    private boolean isHaveArchitect(Employee e) {
        if (e instanceof Architect) {
            for (int i = 0; i < total; i++) {
                if (team[i] instanceof Architect) {
                    return true;
                }
            }
        }
        return false;
    }

    //当待添加成员对象是设计师时，判断当前团队中是否已经有两名设计师
    private boolean isHaveDesigner(Employee e) {
        int count = 0;
        if (e instanceof Designer && !(e instanceof Architect)) {
            for (int i = 0; i < total; i++) {
                if (team[i] instanceof Designer && !(team[i] instanceof Architect)) {
                    count++;
                }
            }
            return count >= 2;
        }
        return false;
    }

    //当待添加成员对象是程序员时，判断当前团队中是否已经有三名程序员
    private boolean isHaveProgrammer(Employee e) {
        int count = 0;
        if (e instanceof Programmer && !(e instanceof Designer)) {
            for (int i = 0; i < total; i++) {
                if (!(team[i] instanceof Designer)) {
                    count++;
                }
            }
            return count >= 3;
        }
        return false;
    }
}

