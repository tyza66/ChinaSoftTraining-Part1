public class TestTX2 {
    public static void main(String[] args) {
        new Thread11().start();
        new Thread22().start();
    }
}
/*
当两个线程互相等待对方释放锁的时候，会发生死锁
死锁的时候不会有任何提示，不会有异常，只不过程序无法继续
 */

class Lock2{
    public static final Object lockA=new Object();
    public static final Object lockB=new Object();
}

class Thread11 extends Thread{
    @Override
    public void run() {
        synchronized (Lock2.lockA){
            System.out.println("1");
            try {
                Lock2.lockA.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Lock2.lockB){

                System.out.println("2");
            }
        }
    }
}

class Thread22 extends Thread{
    @Override
    public void run() {
        synchronized (Lock2.lockB){
            System.out.println("a");
            synchronized (Lock2.lockA){
                System.out.println("b");
                Lock2.lockA.notify();
            }
        }
    }
}