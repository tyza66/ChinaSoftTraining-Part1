package 作业;

public class Zy4 {

    public static void main(String[] args) {
        shuxue();
    }

    public static void shuxue(){

        for(int i=-10;i<=10;i++){

            try {
                int b = 10 / i;
                System.out.println(b);
            }catch (ArithmeticException e){
                System.out.println("分母不能为0");
            }
        }
    }
}
