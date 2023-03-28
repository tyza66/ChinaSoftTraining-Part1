public class TestLock {
    public static void main(String[] args) {

        ThreadC t1 = new ThreadC();
        t1.setName("A");
        ThreadC t2 = new ThreadC();
        t2.setName("B");
        ThreadC t3 = new ThreadC();
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }
}
//线程的异步执行，并发执行，同时执行
//线程的同步执行，按顺序执行 加锁  对象锁 方法锁

class ThreadC extends Thread {

    private  static final Object o = new Object();
    //方法锁
   /* @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+"锁住了"+"\n");
        for(int i=1;i<=20;i++){
            System.out.print(Thread.currentThread().getName()+i+"  ");
        }
        System.out.println(Thread.currentThread().getName()+"释放了"+"\n");
    }*/

    @Override
    public void run() {
        synchronized (o) {
            System.out.println(Thread.currentThread().getName() + "锁住了" + "\n");
            for (int i = 1; i <= 20; i++) {
                System.out.print(Thread.currentThread().getName() + i + "  ");
            }
            System.out.println(Thread.currentThread().getName() + "释放了" + "\n");
        }
    }
}
