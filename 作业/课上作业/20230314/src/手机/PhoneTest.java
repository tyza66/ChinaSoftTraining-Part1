package 手机;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p =  new Phone();
        p.setBrand("小米");
        p.setColor("黑色");
        p.setPrice(1);
        p.call();
        p.sendMassage();
    }
}
