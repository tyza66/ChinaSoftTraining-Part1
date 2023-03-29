package com.team.domain.pojo;

import com.team.domain.pojo.employee.Programmer;

import java.util.Arrays;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:10
 * Github: https://github.com/tyza66
 */
public class Project {
    private int proId;//项目号
    private String projectName;//项目名称
    private String desName;//项目描述
    private Programmer[] team;//开发团队
    private String teamName;//开发团队名称
    private boolean status;//开发状态（true为开发中，false为未开发中）

    public Project(int proId, String projectName, Programmer[] team, String teamName,String desName, boolean status) {
        this.proId = proId;
        this.projectName = projectName;
        this.desName=desName;
        this.team = team;
        this.teamName = teamName;
        this.status = status;
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

    public Programmer[] getTeam() {
        return team;
    }

    public void setTeam(Programmer[] team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "项目{" +
                "项目号=" + proId +
                ", 项目名称='" + projectName + '\'' +
                ", 开发团队=" + Arrays.toString(team) +
                ", 开发团队名称='" + teamName + '\'' +
                ", 开发状态=" + status +
                '}';
    }
}

