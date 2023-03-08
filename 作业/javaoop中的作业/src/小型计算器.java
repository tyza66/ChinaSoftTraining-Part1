import java.util.Scanner;

public class 小型计算器 {
    public static void main(String[] args) {
        /*小型计算器：
        1．有简单运算选择界面
        2．采用循环实现菜单显示
        3．采用switch结构实现菜单的选择
        4．运算对象为两个操作数，从键盘输入
        5．运算结果输出*/
        Scanner input = new Scanner(System.in);
        int id = 0;
        boolean run = true;
        while(run){
            System.out.println("=======超级无敌计算系统=======");
            System.out.println("（1）计算加法");
            System.out.println("（2）计算减法");
            System.out.println("（3）计算乘法");
            System.out.println("（4）计算除法");
            System.out.println("（0）退出系统");
            System.out.println("（请输入序号选择）");
            id = input.nextInt();
            switch (id){
                case 0:
                    run = false;
                    break;
                case 1:
                    System.out.println("请依次输入需要相加的两个数值：");
                    System.out.println(input.nextInt()+input.nextInt());
                    break;
                case 2:
                    System.out.println("请依次输入需要相减的两个数值：");
                    System.out.println(input.nextInt()-input.nextInt());
                    break;
                case 3:
                    System.out.println("请依次输入需要相乘的两个数值：");
                    System.out.println(input.nextInt()*input.nextInt());
                    break;
                case 4:
                    System.out.println("请依次输入需要相除的两个数值：");
                    System.out.println(input.nextInt()/input.nextInt());
                    break;
            }
        }
    }
}
