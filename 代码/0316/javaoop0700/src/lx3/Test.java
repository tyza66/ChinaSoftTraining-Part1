package lx3;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager("小郑",123,15000,6000);
        manager.work();

        Coder coder=new Coder("小李",135,10000);
        coder.work();
    }
}
