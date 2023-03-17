package 异常;

public class Test6 {

    public static void main(String[] args) {

        jisuan();
    }

    public static void jisuan(){
        try {
            int m = 10;
            //int n = 0;// 2 3 4
            int n=2;// 5 1  3 4
            System.out.println(m / n);
            System.out.println(1);
        }catch (Exception e){
            System.out.println(2);
        }finally {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
