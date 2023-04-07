package com.team.pojo;

import java.util.ArrayList;
import java.util.List;

public class Team {


    private String teamName;//团队名称
    private List<Employee> list=new ArrayList<>();

    public Team() {
    }

    public Team(String teamName, List<Employee> list) {
        this.teamName = teamName;
        this.list = list;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", list=" + list +
                '}';
    }
}
