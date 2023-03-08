package 面对对象之前;

public class 猴子偷桃 {
    public static void main(String[] args) {
        //作业2、一堆桃子，猴子吃的规则是：吃总数一半多一个，吃到第10天之后，还余1个，求总共多少个桃子？
        int sum = 1;
        for (int i = 0; i < 9; i++) {
            sum = (sum+1)*2;
        }
        System.out.println(sum);
    }
}
