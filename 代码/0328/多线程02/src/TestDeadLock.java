public class TestDeadLock {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
/*
当两个线程互相等待对方释放锁的时候，会发生死锁
死锁的时候不会有任何提示，不会有异常，只不过程序无法继续
 */

class Lock{
    public static final Object lockA=new Object();
    public static final Object lockB=new Object();
}
class Thread1 extends Thread{
    @Override
    public void run() {
        synchronized (Lock.lockA){
            System.out.println("1");
            synchronized (Lock.lockB){
                System.out.println("2");
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        synchronized (Lock.lockB){
            System.out.println("a");
            synchronized (Lock.lockA){
                System.out.println("b");
            }
        }
    }
}