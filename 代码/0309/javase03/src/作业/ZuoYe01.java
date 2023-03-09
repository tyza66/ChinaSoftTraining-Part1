package 作业;

public class ZuoYe01 {

    public static void main(String[] args) {

        /*打印出三位数的“水仙花数“

        水仙花数是指一个 3 位数 ( n≥3 )，它的每个位上的数字的3次方等于它本身。（例如：111 + 555+ 333 = 153）*//**/

        for(int n=100;n<1000;n++){

            int ge=n%10;//个位
            int shi=n%100/10;//十位
            int bai=n/100;//百位
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==n){
                System.out.println(n);
            }

        }

    }
}
