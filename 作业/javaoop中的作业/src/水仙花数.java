public class 水仙花数 {
    public static void main(String[] args) {
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
