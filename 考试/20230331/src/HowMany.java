import java.util.Scanner;

/**
 * Author: tyza66
 * CreateTime: 2023-03-31 15:13
 * Github: https://github.com/tyza66
 */
public class HowMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum1=0,sum2=0;
        System.out.print("请输入要检查的字符串：");
        String all = input.next();
        for(char one:all.toCharArray()){
            if(one>=65&&one<=90){
                sum1++;
            }else if(one>=97&&one<=122){
                sum2++;
            }
        }
        System.out.println("大写字母有"+sum1+"个，小写字母有"+sum2+"个");
    }
}
