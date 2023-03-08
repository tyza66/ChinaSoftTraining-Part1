package 面对对象之前;

public class 各种输出 {
    public static void main(String[] args) {
        int i = 0, j = 0;
//        1. 输出1-100
        for (i = 1; i <= 99; i++) {
            System.out.print(i + ",");
        }
        System.out.println("100");
//        2.输出100-1
        for (i = 100; i >= 2; i--) {
            System.out.print(i + ",");
        }
        System.out.println("1");
//        3.输出1-100 之间的所有偶数值
        for (i = 1; i <= 99; i++) {
            if (i % 2 == 0)
                System.out.print(i + ",");
        }
        System.out.println("100");
//        4. 输出1-100之间的所有奇数值
        for (i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.print(i + ",");
        }
        System.out.println();
//        5. 输出1-100之间不能被3整除的所有数
        for (i = 1; i <= 99; i++) {
            if (i % 3 != 0)
                System.out.print(i + ",");
        }
        System.out.println("100");
//        6. 求1-100之间所有数的和
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
//        7.输出1-100之间不能被3整除的所有数之和
        sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 3 != 0)
                sum += i;
        }
        System.out.println(sum);
//        8. 求10的阶乘  1*2*3*4*。。*10
        sum = 1;
        for (i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
//        9.打印这2个图形
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 7; j++) {
                if (j <= 4-i) {
                    System.out.print(" ");
                } else if(j<(4-i)+2*(i-1)+2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
