package com.team.service.managements;

import com.team.domain.exceptions.*;
import com.team.domain.pojo.employee.Architect;
import com.team.domain.pojo.employee.Designer;
import com.team.domain.pojo.employee.Employee;
import com.team.domain.pojo.employee.Programmer;

import java.util.*;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentTeamSchedulingManagement {
    DeveloperManagement dm = new DeveloperManagement();
    private final int MAX_MEMBER = 5;
    private static ArrayList<ArrayList<Programmer>> allTeam = new ArrayList<>();
    private static Map<String, ArrayList<Programmer>> ids = new HashMap<>();
    static int now = 1;

    public DevelopmentTeamSchedulingManagement() {
        try {
            if (allTeam.size() == 0) {
                newTeam(new Employee[]{dm.queryOne(2), dm.queryOne(3)});
            }
        } catch (OneIsNotAProgrammer oneIsNotAProgrammer) {
            oneIsNotAProgrammer.printStackTrace();
        } catch (TeamFullException e) {
            e.printStackTrace();
        } catch (OneIsAlreadyInException e) {
            e.printStackTrace();
        } catch (OneIsAlreadyInAnotherTeamException e) {
            e.printStackTrace();
        } catch (MaxNumberOfDesigner maxNumberOfDesigner) {
            maxNumberOfDesigner.printStackTrace();
        } catch (MaxMumberOfArchitect maxMumberOfArchitect) {
            maxMumberOfArchitect.printStackTrace();
        } catch (MaxNumberOfProgrammer maxNumberOfProgrammer) {
            maxNumberOfProgrammer.printStackTrace();
        }
    }

    public void newTeam(Employee[] e) throws OneIsNotAProgrammer, TeamFullException, OneIsAlreadyInException, OneIsAlreadyInAnotherTeamException, MaxNumberOfDesigner, MaxMumberOfArchitect, MaxNumberOfProgrammer {
        ArrayList<Programmer> team = new ArrayList<>();

        for (Employee one : e) {
            addOneByTeam(team, one);
        }
        allTeam.add(team);
        ids.put("" + now++, team);
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
            team.add((Architect) one);
            ((Architect) one).setStatus(false);
        } else if (one instanceof Designer) {
            if (howManyDesigner(team) == 2) {
                throw new MaxNumberOfDesigner();
            }
            team.add((Designer) one);
            ((Designer) one).setStatus(false);
        } else if (one instanceof Programmer) {
            if (howManyProgrammer(team) == 3) {
                throw new MaxNumberOfProgrammer();
            }
            team.add((Programmer) one);
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

    public Set<Map.Entry<String, ArrayList<Programmer>>> getAll() {
        return ids.entrySet();
    }

    public ArrayList<Programmer> getTeamById(String id) {
        return ids.get(id);
    }

    public boolean DeleteOne(ArrayList<Programmer> team, Employee one) {
        if (one instanceof Programmer) {
            ((Programmer) one).setStatus(true);
        }
        return team.remove(one);
    }

    public boolean deleteOneTeam(String id) {
        ArrayList<Programmer> programmers = ids.get(id);
        if (programmers != null) {
            allTeam.remove(programmers);
            ids.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<ArrayList<Programmer>> getAllTeam() {
        return allTeam;
    }
}
