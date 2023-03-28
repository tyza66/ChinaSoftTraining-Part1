public class ThreadT {
    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket();
        ThreadA t1 = new ThreadA(ticket);
        ThreadA t2 = new ThreadA(ticket);
        t1.setName("售票1");
        t2.setName("售票2");
        t1.start();
        t2.start();
    }
}

class ThreadA extends Thread {
    Ticket t;

    public ThreadA(Ticket t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (t) {
                t.notifyAll();
                if (t.num == 0) break;
                System.out.println(Thread.currentThread().getName() + ",卖票" + t.num--);
                try {
                    t.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//如果使用Integer最为锁的对象 对Integer对象进行++等操作的时候，会进行自动的拆箱装箱 也就是说操作前先拆箱之后操作 之后装箱产生了一个新的对象导致锁对象发生变化从而报错
class Ticket {
    int num = 100;
}
