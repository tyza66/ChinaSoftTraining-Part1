package com.team.view;

/*
  软件主界面类（将4个模块衔接在一起）
 */
public class IndexView {
    private static LoginView lv = new LoginView();
    private static NameListView nlv = new NameListView();
    private static TeamView tv = new TeamView();
    private static ProjectView pv = new ProjectView();
    /*
      颜色特效
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        IndexView iv = new IndexView();
        lv.initMenu();
        iv.softwareMainMenu();
    }

    //软件主菜单
    private void softwareMainMenu() {
        while (true) {
            System.out.println(ANSI_RESET + ANSI_BLUE);
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
            System.out.print(ANSI_RESET);
            switch (TSUtility.readMenuSelectionPro()) {
                case '1':
                    lv.modifyMenu();
                    break;
                case '2':
                    try {
                        TSUtility.loadSpecialEffects();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    nlv.DeveloperManageMainMenu();
                    break;
                case '3':
                    tv.developTeamMainMenu();
                    break;
                case '4':
                    pv.projectManageMainMenu();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    if (TSUtility.readConfirmSelection() == 'Y') {
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}
