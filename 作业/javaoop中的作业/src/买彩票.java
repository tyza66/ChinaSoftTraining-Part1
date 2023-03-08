import java.util.Scanner;

public class 买彩票 {
    /*
    案例 1、买彩票
    功能描述：如果体彩中了 500 万，我买房、买车、资助希望工程、去欧洲旅游；如 果没中，我买下一期体彩，继续烧高香
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String num = "";
            System.out.println("输入你要买的彩票号");
            num = input.next();
            if (num.equals("666666")) {
                System.out.println("我买房、买车、资助希望工程、去欧洲旅游");
                break;
            } else {
                System.out.println("我买下一期体彩，继续烧高香 ");
            }
        }
    }
}
