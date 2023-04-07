package com.team.pojo;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private int proId;//项目号
    private String projectName;//项目名称
    private String desName;//项目描述
    private Team team;//开发团队


    public Project() {
    }

    public Project(int proId, String projectName, String desName, Team team) {
        this.proId = proId;
        this.projectName = projectName;
        this.desName = desName;
        this.team = team;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Project{" +
                "proId=" + proId +
                ", projectName='" + projectName + '\'' +
                ", desName='" + desName + '\'' +
                ", team=" + team +
                '}';
    }
}
