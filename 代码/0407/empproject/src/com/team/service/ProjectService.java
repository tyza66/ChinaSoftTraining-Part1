package com.team.service;

import com.team.domain.Programmer;
import com.team.domain.Project;

import java.util.ArrayList;

public class ProjectService {
    private ArrayList<Project> pro=new ArrayList<>();
    private int count=1;
    //添加项目
    public boolean addProject(char num) {
        switch (num) {
            case '1':
                if (isAdded("小米官网")) {
                    return false;
                }
                pro.add(new Project(count++, "小米官网", null, null,
                        "开发完成类似于小米官网的web项目.", false));
                break;
            case '2':
                if (isAdded("公益在线商场")) {
                    return false;
                }
                pro.add(new Project(count++, "公益在线商场", null,
                        null, "猫宁Morning公益商城是中国公益性在线电子商城.", false));
                break;
            case '3':
                if (isAdded("博客系统")) {
                    return false;
                }
                pro.add(new Project(count++, "博客系统", null,
                        null, "Java博客系统，让每一个有故事的人更好的表达想法！", false));
                break;
            case '4':
                if (isAdded("在线协作文档编辑系统")) {
                    return false;
                }
                pro.add(new Project(count++, "在线协作文档编辑系统", null,
                        null, "一个很常用的功能，适合小组内的文档编辑.", false));
                break;
        }
        System.out.println("已添加项目：" + pro.get(count - 2).getProjectName());
        return true;
    }

    //给项目分配开发团队
    public boolean dealingPro(Programmer[]team,String teamName){
        for (Project p:pro){
            if (!p.isStatus()){
                p.setTeam(team);
                p.setTeamName(teamName);
                p.setStatus(true);
                return true;
            }
        }

        return false;
    }
    //查看项目
    public ArrayList<Project>getPro(){return pro;}
    //删除项目
    public void delPro(int proId){
        pro.remove(proId-1);
        for (int i=proId;i<pro.size();i++){
            pro.get(i).setProId(pro.get(i).getProId()-1);
        }
        count--;
    }
    //判断是否有未被开发的项目（true有，false无）
    public boolean isNotDeveloped(){
        for (Project p:pro){
            if (!p.isStatus()){
                return true;

            }
        }
        return false;
    }
    //判断项目是否已经被添加到集合中（仅供本类addProject方法调用）
    private boolean isAdded(String projectName){
        for (Project p:pro){
            if (p.getProjectName().equals(projectName)){
                return true;
            }
        }
        return false;

    }



}
