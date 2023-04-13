package com.team.view;

import com.team.pojo.Project;
import com.team.pojo.Team;
import com.team.service.ProjectService;
import com.team.service.TeamService;

import java.util.List;
import java.util.Scanner;

public class ProjectView {

    private ProjectService projectService=new ProjectService();
    private TeamService teamService=new TeamService();
    Scanner sc=new Scanner(System.in);

    public void projectInitView(){
        while(true){
            System.out.println("🔣        ~开发项目管理主菜单~        🔣");
            System.out.println("🐕1.     <项目的添加>           *");
            System.out.println("🐖2.     <项目分配开发团队>      *");
            System.out.println("🐱3.     <项目的查看>           *");
            System.out.println("🐂4.     <项目的删除>           *");
            System.out.println("🐇5.     <退出当前菜单>          *");
            System.out.print("⬇请选择：");
            int num=sc.nextInt();
            if(num==5){
                System.out.println("退出了当前系统");
                break;
            }
            switch (num){
                case 1: showProjectAdd();break;
                case 2: showfenPeiTeam();break;
                case 3: showQueryOneProject();break;
                case 4: showDeleteProject();break;

            }
        }
    }

    private void showDeleteProject() {
        System.out.println("请输入您要删除的项目编号：");
        int proId=sc.nextInt();
        projectService.deleteProjectById(proId);
    }

    private void showQueryOneProject() {
        System.out.println("请输入您要查询的项目编号：");
        int proId=sc.nextInt();
        projectService.queryProjectById(proId);
    }

    private void showfenPeiTeam() {
        System.out.println("进入分配开发团队的界面");
        List<Team> teams = TeamService.getTeams();
        System.out.println(teams);
        System.out.println("请选择输入相应的团队名称来添加：");
        String teamName=sc.next();
        Team team = teamService.queryTeamById(teamName);
        System.out.println("请输入您要分配给的项目编号：");
        int proId=sc.nextInt();
        projectService.fenpeiTeam(proId,team);

    }

    private void showProjectAdd() {

        System.out.println("请输入项目编号：");
        int proId=sc.nextInt();
        System.out.println("请输入项目名称：");
        String proName=sc.next();
        System.out.println("请输入项目描述：");
        String desName=sc.next();

        Project project=new Project(proId,proName,desName);
        projectService.addProject(project);
    }
}
