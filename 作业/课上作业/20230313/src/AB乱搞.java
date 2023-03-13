import java.util.Scanner;

public class AB乱搞 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a%b==0||(a+b)>1000){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
