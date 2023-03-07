public class Number {

    public static void main(String[] args) {

        //给定一个int型整数563，要求他经过与10或100之间进行运算，得到一个值365
        int num=563;
        int n1=num%10;//3  个位数
        int n2=num%100/10;//6 十位数
        int n3=num/100;  //5  百位数
        int num2=n1*100+n2*10+n3;
        System.out.println(num2);
    }
}
