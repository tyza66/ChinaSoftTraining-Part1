public class Test {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println("a"+i);
            if (i==3){
                continue;
            }
            System.out.println("b"+i);
        }
    }
}
