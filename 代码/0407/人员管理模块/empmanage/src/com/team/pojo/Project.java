package com.team.pojo;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private int proId;//项目号
    private String projectName;//项目名称
    private String desName;//项目描述
    private List<Programmer> team=new ArrayList<>();//开发团队
    private String teamName;//开发团队名称


    public Project() {
    }

    public Project(int proId, String projectName, String desName, List<Programmer> team, String teamName) {
        this.proId = proId;
        this.projectName = projectName;
        this.desName = desName;
        this.team = team;
        this.teamName = teamName;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDesName() {
        return desName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public List<Programmer> getTeam() {
        return team;
    }

    public void setTeam(List<Programmer> team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "proId=" + proId +
                ", projectName='" + projectName + '\'' +
                ", desName='" + desName + '\'' +
                ", team=" + team +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
