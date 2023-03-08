package 循环结构;

public class TestDoWhile {
    public static void main(String[] args) {

        /*
        循环初始条件
        do{
            循环体；
            状态改变部分
        }(循环终止条件)
         */

        //输出1--10
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);

        System.out.println();

        int j=10;
        do{
            System.out.print(j+" " );
            j--;
        }while(j>0);


        System.out.println();
        // do..while 和for,while正常是一样的，但是do..while循环能够在条件不满足的情况下，也能够执行一次

        int m=10;
        do{
            System.out.print(m+" ");
            m++;
        }while(m<10);
    }
}
