package com.team.view;

import java.util.Scanner;

public class IndexView {

    Scanner sc=new Scanner(System.in);
    private LoginView lv=new LoginView();
    private EmployeeView ev=new EmployeeView();
    private TeamView tv=new TeamView();
    private ProjectView pv=new ProjectView();

    public void initMainView(){
        while(true){

            System.out.println("🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣");
            System.out.println("🔣                                   🔣");
            System.out.println("🔣             ~软件主菜单~           🔣");
            System.out.println("🔣                                   🔣");
            System.out.println("🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣🔣");
            System.out.println("🐻1. <用户信息修改>                *");
            System.out.println("🐘2. <开发人员管理>                *");
            System.out.println("🦁3. <开发团队调度管理>             *");
            System.out.println("🐻4. <开发项目管理>                *");
            System.out.println("🦊5. <退出软件>                    *");
            System.out.println("⬇请选择：  ");
            int num=sc.nextInt();
            if(num==5){
                System.out.println("您退出了系统");
                break;
            }
            switch (num){
                case 1: lv.showUpdatePass();break;
                case 2: ev.empInitView();break;
                case 3: tv.teamInitView();break;
                case 4: pv.projectInitView();break;
            }


        }
    }
}
