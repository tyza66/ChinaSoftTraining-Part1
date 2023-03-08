package 面对对象之前;

public class 水仙花数 {
    public static void main(String[] args) {
        //水仙花数是指一个 3 位数 ( n≥3 )，它的每个位上的数字的3次方等于它本身。（例如：111 + 555+ 333 = 153）
        for(int i=100;i<=999;i++){
            int a = i/100;
            int b = i%100/10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
