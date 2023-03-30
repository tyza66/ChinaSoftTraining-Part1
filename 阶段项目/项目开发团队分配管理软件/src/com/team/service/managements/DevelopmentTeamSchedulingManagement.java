package com.team.service.managements;

import com.team.domain.exceptions.*;
import com.team.domain.pojo.employee.Architect;
import com.team.domain.pojo.employee.Designer;
import com.team.domain.pojo.employee.Employee;
import com.team.domain.pojo.employee.Programmer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentTeamSchedulingManagement {
    private final int MAX_MEMBER = 5;
    private ArrayList<ArrayList<Programmer>> allTeam = new ArrayList<>();

    public void newTeam(Employee[] e) throws OneIsNotAProgrammer, TeamFullException, OneIsAlreadyInException, OneIsAlreadyInAnotherTeamException, MaxNumberOfDesigner, MaxMumberOfArchitect, MaxNumberOfProgrammer {
        ArrayList<Programmer> team = new ArrayList<>();
        allTeam.add(team);
        for (Employee one : e) {
            addOneByTeam(team, one);
        }
    }

    public void addOneByTeam(ArrayList<Programmer> team, Employee one) throws OneIsNotAProgrammer, TeamFullException, OneIsAlreadyInException, OneIsAlreadyInAnotherTeamException, MaxNumberOfProgrammer, MaxNumberOfDesigner, MaxMumberOfArchitect {
        if (team.size() == MAX_MEMBER) {
            throw new TeamFullException();
        }
        if (team.contains(one)) {
            throw new OneIsAlreadyInException();
        }
        if (one instanceof Programmer) {
            if (!((Programmer) one).isStatus()) {
                throw new OneIsAlreadyInAnotherTeamException();
            }
        }

        if (one instanceof Architect) {
            if (howManyArchitect(team) == 1) {
                throw new MaxMumberOfArchitect();
            }
            ((Architect) one).setStatus(false);
        } else if (one instanceof Designer) {
            if (howManyDesigner(team)==1){
                throw new MaxNumberOfDesigner();
            }
                ((Designer) one).setStatus(false);
        } else if (one instanceof Programmer) {
            if(howManyProgrammer(team)==1){
                throw new MaxNumberOfProgrammer();
            }
            ((Programmer) one).setStatus(false);
        } else {
            throw new OneIsNotAProgrammer();
        }
    }

    public int howManyDesigner(ArrayList<Programmer> team) {
        int sum = 0;
        for (Employee one : team) {
            if (one instanceof Architect) {

            } else if (one instanceof Designer) {
                sum++;
            } else if (one instanceof Programmer) {

            }
        }
        return sum;
    }

    public int howManyProgrammer(ArrayList<Programmer> team) {
        int sum = 0;
        for (Employee one : team) {
            if (one instanceof Architect) {

            } else if (one instanceof Designer) {

            } else if (one instanceof Programmer) {
                sum++;
            }
        }
        return sum;
    }

    public int howManyArchitect(ArrayList<Programmer> team) {
        int sum = 0;
        for (Employee one : team) {
            if (one instanceof Architect) {
                sum++;
            } else if (one instanceof Designer) {

            } else if (one instanceof Programmer) {

            }
        }
        return sum;
    }
}
