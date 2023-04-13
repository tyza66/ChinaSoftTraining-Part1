package com.team.test;

import com.team.view.ProjectView;
import com.team.view.TeamView;

public class Test3 {
    public static void main(String[] args) {
        TeamView tv=new TeamView();
        tv.teamInitView();
        ProjectView pv=new ProjectView();
        pv.projectInitView();
    }
}
