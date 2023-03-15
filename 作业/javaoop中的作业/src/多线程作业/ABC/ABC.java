package 多线程作业.ABC;

public class ABC {
    public static void main(String[] args) throws InterruptedException {
        Object as = new Object();
        Object bs = new Object();
        Object cs = new Object();
        Thread a = new Thread(new Out("A", cs, as));
        a.setName("A");
        Thread b = new Thread(new Out("B", as, bs));
        a.setName("B");
        Thread c = new Thread(new Out("C", bs, cs));
        a.setName("C");
        a.start();
        Thread.sleep(10);
        b.start();
        Thread.sleep(10);
        c.start();
    }
}

class Out implements Runnable {
    String inside;
    private Object now;
    private Object pre;

    public Out(String inside, Object pre, Object now) {
        this.inside = inside;
        this.now = now;
        this.pre = pre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (pre) {
                //这玩意现时拿进来cs和bs两个信息，
                //进去输出循环后，首先判断了pre也就是cs是否被占用
                //如果cs没被占用和（上一个线程字母节点没锁） 因为一开始的时候，各个对象都没被占用，所以入口一定会顺利执行
                //之后判断bs（也就是当前在线程应该弄得字母的状况）如果现在调用这个字母的线程没被锁，说明轮到了当前节点
                //如果轮到了当前节点，就把当前节点的的锁唤醒，并且打印自己的值
                //之后上一个的锁开始等待
                //当一个线程运行时，它先获取前一个锁，
                // 然后获取自身的锁。
                // 在自身的锁中，它打印自己的名字，
                // 并唤醒等待在自身锁上的下一个线程。
                // 然后释放自身的锁，并等待在前一个锁上被唤醒。
                // 这样就形成了一个循环链：A->B->C->A…。
                synchronized (now) {
                    System.out.print(inside);
                    //System.out.println("唤醒" + now);
                    now.notify();//通知等待这个锁的对方线程，你需要的条件满足了，不用等了
                }
                //等待，并且把当前锁给释放了
                try {
                    pre.wait();
                    //System.out.println("释放" + pre);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
