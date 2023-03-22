package 递归;

public class TestDiGui {
    public static void main(String[] args) {
        jc();//3628800
        int cheng = cheng(10);
        System.out.println(cheng);//3628800
    }
    //求10的阶乘
    public static void jc(){
        int cheng=1;
        for(int i=1;i<=10;i++){
            cheng*=i;
        }
        System.out.println(cheng);
    }

    //递归 ，在方法内部再次调用本方法
    public static int cheng(int n){

        if(n==1){
            return 1;
        }
        return n*cheng(n-1);
    }
}
