package 匿名内部类;

public class Test {
    public static void main(String[] args) {
        Father f = new Son();
        f.giao();

        Father f1 = new Father() {
            public void giao() {
                System.out.println("giao3");
            }
        };
        f1.giao();

        Giaoer g = new Giaoer(){
            @Override
            public void sqy() {
                System.out.println(111);
            }
        };
        g.sqy();
    }
}

class Father {
    public void giao() {
        System.out.println("giao1");
    }
}

class Son extends Father {
    public void giao() {
        System.out.println("giao2");
    }
}

interface Giaoer{
    void sqy();
}
