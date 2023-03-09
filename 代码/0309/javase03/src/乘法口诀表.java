public class 乘法口诀表 {

    public static void main(String[] args) {

        //九九乘法口诀表
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        System.out.println("------------------");
        int m=1;
        while(m<=9){

            int n=1;
            while(n<=m){
                System.out.print(n+"*"+m+"="+n*m+"\t");
                n++;
            }
            System.out.println();

            m++;
        }

    }
}


