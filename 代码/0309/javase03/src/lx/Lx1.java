package lx;

public class Lx1 {

    /*1. 输出1-100

            2.输出100-1

            3.输出1-100 之间的所有偶数值

4. 输出1-100之间的所有奇数值

5. 输出1-100之间不能被3整除的所有数*/
    public static void main(String[] args) {
        // 输出1-100
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }


        System.out.println();//打印空行

        //打印100-1
        for(int i=100;i>0;i--){
            System.out.print(i+" ");
        }

        //输出1-100之间所有的偶数值

        System.out.println();
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //输出1-100之间所有的奇数值
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //输出1-100之间不能被3整除的所有数
        for(int i=1;i<=100;i++){
            if(i%3!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

//        6. 求1-100之间所有数的和

        int sum1=0;
        for(int i=1;i<=100;i++){
           // sum1=sum1+i;
            sum1+=i;
        }
        System.out.println(sum1);//5050
//
//        7.输出1-100之间不能被3整除的所有数之和

        int sum2=0;
        for(int i=1;i<=100;i++){
            if(i%3!=0){
                sum2+=i;
            }
        }
        System.out.println(sum2);//3367
//
//
//        8. 求10的阶乘  1*2*3*4*。。*
        int jc=1;
        for(int i=1;i<=10;i++){
            jc*=i;
        }
        System.out.println(jc);//3628800
    }
}
