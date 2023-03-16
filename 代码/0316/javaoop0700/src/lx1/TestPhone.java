package lx1;

public class TestPhone {

    public static void main(String[] args) {
        Phone p=new Phone();
        //通过setter方法赋值
        p.setBrand("小米手机");
        p.setColor("黑色");
        p.setPrice(3998);

        p.call();
        p.sendMessage();
    }
}
