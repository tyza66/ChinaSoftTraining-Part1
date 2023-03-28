public class TestTX {

    public static void main(String[] args) {

        new ThreadE().start();
        new ThreadF().start();
    }
}
class Suo{
    public static final Object o=new Object();
}

class ThreadE extends Thread{

    @Override
    public void run() {

        synchronized (Suo.o){
            System.out.println("1");
            System.out.println("2");
            //输出12 之后，让他等待，会把当前的锁给释放了
            try {
                Suo.o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("3");
            System.out.println("4");
        }
    }
}
class ThreadF extends Thread{
    @Override
    public void run() {

        synchronized (Suo.o){
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");
            Suo.o.notify();//通知对方不需要再等待了，可以直接执行
        }
    }
}