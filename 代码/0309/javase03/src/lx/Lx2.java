package lx;

public class Lx2 {
    public static void main(String[] args) {

    /*    .打印这2个图形

                *
               **
              ***
             ****
            *****

            -----------------------
            行数    空格    *号
            1       4       1
            2       3       2
            3       2       3
            4       1       4
            5       0       5
            i       5-i     i
            -----------------------

               *
              ***
             *****
            *******

            --------------------
            行数   空格    *号
            1    3       1
            2   2       3
            3   1       5
            4   0       7

            i   4-i     i*2-1


            */

        for(int i=1;i<=5;i++){
            //先打印空格

            for(int j=5-i;j>=0;j--){
                System.out.print(" ");
            }

            //再打印*号
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println("-------------------");

        for(int i=1;i<=4;i++){
            //先打印空格
            for(int m=4-i;m>=0;m--){
                System.out.print(" ");
            }

            //再打印*
            for(int n=1;n<=i*2-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
