package 循环结构;

public class TestWhile {

    public static void main(String[] args) {

        /*

        循环初始条件；
        while(循环终止条件){
            循环体；
            状态改变部分；
        }
         */

        //输出1-10
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();
        //输出10-1
        int j=10;
        while(j>0){
            System.out.print(j+" ");
            j--;
        }
    }
}


