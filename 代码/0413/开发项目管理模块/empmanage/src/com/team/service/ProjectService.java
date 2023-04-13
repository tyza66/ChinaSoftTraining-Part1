package com.team.service;

import com.team.pojo.Project;
import com.team.pojo.Team;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    private List<Project> list=new ArrayList<>();

    public void addProject(Project project){
        list.add(project);
    }

    public void queryAllProject(){
        for(int i=0;i<list.size();i++){
            Project project = list.get(i);
            System.out.println(project);
        }
    }

    public void queryProjectById(int id){
        for(int i=0;i<list.size();i++){
            Project project = list.get(i);
            if(project.getProId()==id){
                System.out.println(project);
            }
        }
    }

    public void deleteProjectById(int id){
        for(int i=0;i<list.size();i++){
            Project project = list.get(i);
            if(project.getProId()==id){
                list.remove(project);
            }
        }
    }

    //随机分配开发团队
    public void fenpeiTeam(int proId, Team team){
        for(int i=0;i<list.size();i++){
            Project project = list.get(i);
            if(project.getProId()==proId){
               project.setTeam(team);
            }
        }
    }

}
