package 作业;

public class Zuoye03 {
    public static void main(String[] args) {

        for(int i=9;i>=1;i--){
            //输出空格

            for(int m=i-1;m>=1;m--){
                System.out.print("\t\t");
            }

            //输出公式
            for(int n=i;n<=9;n++){
                System.out.print(i+"*"+n+"="+(n*i)+"\t");
            }
            System.out.println();
        }
    }
}
