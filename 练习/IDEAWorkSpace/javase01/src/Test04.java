public class Test04 {
    public static void main(String[] args) {
        //用10和100把563变成365
        int a = 563;
        int b3 = a/100;
        int b2 = a%100/10;
        int b1 = a%10;
        int b = 100*b1+10*b2+b3;
        System.out.println(b);
    }
}
