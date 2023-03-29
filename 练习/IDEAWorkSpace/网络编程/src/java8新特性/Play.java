package java8新特性;

public class Play {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public int test() {
                return 96;
            }
        };
        System.out.println(t.test());
        Test t1 = ()-> 1;
        System.out.println(t1.test());
    }
}
