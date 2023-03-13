public class 最大最小 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 6;
        int min = 5, max = 5;
        if (a < min) min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("最大值是"+max+" 最小值是"+min);
    }
}
