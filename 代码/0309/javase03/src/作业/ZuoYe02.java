package 作业;

public class ZuoYe02 {
    public static void main(String[] args) {

    //        一堆桃子，猴子吃的规则是：吃总数一半多一个，吃到第10天之后，还余1个，求总共多少个桃子？

        int day=10;
        int total=1;
        while(day>=1){

            //循环体
            total=(total+1)*2;

            day--;
        }
        System.out.println(total);//3070



    }
}
