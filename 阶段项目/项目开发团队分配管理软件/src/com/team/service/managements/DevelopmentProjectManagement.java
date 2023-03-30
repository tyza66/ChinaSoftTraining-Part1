package com.team.service.managements;

import com.team.domain.pojo.Project;
import com.team.domain.pojo.employee.Programmer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentProjectManagement {
    static ArrayList<Project> projects = new ArrayList<>();
    static int id = 1;

    public DevelopmentProjectManagement() {
        newProject("小小工程","这是一个小小的工程1");
    }

    public void newProject(String name, String in){
        ArrayList<ArrayList<Programmer>> allTeam = DevelopmentTeamSchedulingManagement.getAllTeam();
        Random rand=new Random();
        int n1=rand.nextInt(allTeam.size());
        projects.add(new Project(id++,name,allTeam.get(n1).toArray(new Programmer[0]),in,true));
    }

    public Project[] getAllProject(){
        return projects.toArray(new Project[0]);
    }
}
