package 异常作业;

public class 模拟分母为零的场景 {
    public static void main(String[] args) {
        int i = 0;
        try {
            for (i = -10; i <= 10; i++) {
                int b = 10 / i;
            }
        } catch (Exception e) {
            System.out.println("你遇到了一个异常，但是以为被catch了，程序不会因此而终止");
            for (i = i+1; i <= 10; i++) {
                int b = 10 / i;
            }
            System.out.println("执行完了");
        }
    }
}
