package 异常作业;

public class 模拟分母为零的场景 {
    public static void main(String[] args) {
        int i = 0;
        for (i = -10; i <= 10; i++) {
            try {
                int b = 10 / i;
            } catch (Exception e) {
                i = i + 1;
            }
        }
        System.out.println(i);
    }
}
