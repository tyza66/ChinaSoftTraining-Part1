import java.util.Scanner;

public class 计算汽车生产完成比率 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jd = 0, n = 0;
        System.out.print("请输入东风汽车厂第一季度汽车产量（万辆）：");
        jd = input.nextDouble();
        System.out.print("请输入东风汽车厂年生产汽车产量（万辆）：");
        n = input.nextDouble();
        System.out.println("该厂第一季度汽车生产量已完成年计划的" + jd / n * 100 + "%");
    }
}
