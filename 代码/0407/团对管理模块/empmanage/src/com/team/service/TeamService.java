package com.team.service;

import com.team.pojo.Employee;
import com.team.pojo.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamService {

    private List<Team> teams=new ArrayList<>();


    //查看团队列表
    public void queryAllTeams(){

        for(int i=0;i<teams.size();i++){
            Team team = teams.get(i);
            System.out.println(team);
        }
    }

    //添加团队成员

    public void addTeam(Team team){
        teams.add(team);
    }


    //删除团队成员 teaName表示要删除的团队名称，id表示要删除的人员编号
    public void deleteTeamEmp(String teamName,int id){
        for(int i=0;i<teams.size();i++){
            Team team = teams.get(i);

            if(team.getTeamName().equals(teamName)){
                List<Employee> empList = team.getList();
                for(int j=0;j<empList.size();j++){
                    Employee employee = empList.get(j);
                    if(employee.getId()==id){
                        empList.remove(employee);
                    }
                }

            }
        }
    }

}
