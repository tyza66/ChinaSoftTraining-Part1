public class Break_Continue {
    public static void main(String[] args) {

        //break 跳出当前循环 continue跳出本次循环

        for(int i=1;i<=5;i++){
            if(i==3){
               // break;// 1  2  跳出当前循环，指得是整个for循环
                continue;// 1 2  4  5 跳出本此循环，值得是i==3这一次循环
            }
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(i==2&&j==3){
                   // break;// break 跳出的是整个内循环，整个该次内循环没有i执行的不再执行
                    continue;//跳出本次循环，值得是i==2 j==3 这次跳出
                }
                System.out.print("i="+i+" j="+j+" ");
            }
            System.out.println();
        }


        System.out.println("------------------------");

        aaa:for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(i==2&&j==3){
                    //break aaa;// break  aaa : 跳出的是整个外循环
                    continue aaa;//跳出的是i==2这次外循环， i==2 j==4也不会执行
                }
                System.out.print("i="+i+" j="+j+" ");
            }
            System.out.println();
        }
    }
}
