package com.team.view;

import com.team.pojo.Employee;
import com.team.pojo.Team;
import com.team.service.EmployeeService;
import com.team.service.TeamService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamView {

    private TeamService teamService=new TeamService();
    private Scanner sc=new Scanner(System.in);
    private EmployeeService employeeService=new EmployeeService();

    public  void teamInitView(){
        while(true){
            System.out.println("※※※※※※※※※※※※※※※");
            System.out.println("※      团队调度界面      ※");
            System.out.println("※※※※※※※※※※※※※※※");
            System.out.print("1-添加团队 2-查看团队 3-删除团队人员 4-退出  请选择(1-4)：");
            System.out.print("⬇请选择：");
            int num=sc.nextInt();
            if(num==4){
                System.out.println("您推出系统了");
                break;
            }
            switch (num){
                case 1: showAddTeam(); break;
                case 2: showQueryTeam(); break;
                case 3: showDeleteTeam();break;
              

            }
        }
    }

    private void showDeleteTeam() {
        System.out.println("请输入您要删除的团队名称");
        String teamName=sc.next();
        System.out.println("请输入您要删除团队里面人员的编号");
        int id=sc.nextInt();
        teamService.deleteTeamEmp(teamName,id);
    }

    private void showQueryTeam() {
        System.out.println("查询所有Team界面");
        teamService.queryAllTeams();
    }

    private void showAddTeam() {

        System.out.println("请输入您要添加的团队名称：");
        String teamName=sc.next();

        List<Employee> list=new ArrayList<>();
        while(true){
            employeeService.queryAllEmployee();
            System.out.println("请选择相应人员编号来添加团队人员，输入0表示退出");
            int num=sc.nextInt();
            if(num==0){
                System.out.println("您推出了系统");
                break;
            }
            Employee employee = employeeService.queryEmployeeById(num);
            list.add(employee);

        }
        Team team=new Team(teamName,list);
        teamService.addTeam(team);

    }
}
