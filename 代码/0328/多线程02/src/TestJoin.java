import javax.imageio.stream.ImageInputStream;

public class TestJoin {
    public static void main(String[] args) {
        ThreadA t1=new ThreadA();
        t1.setName("乌龟");
        ThreadB t2=new ThreadB();
        t2.setName("兔子");
        ThreadB.t=t1;//t其实就是乌龟线程，将乌龟线程对象赋值给t
        t2.start();
        t1.start();
    }
}
//模拟龟兔赛跑

//乌龟线程
class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+(i*100)+"米");
        }
    }
}
//兔子
class ThreadB extends Thread{

    static Thread t;
    @Override
    public void run() {
        for(int i=1;i<=10;i++){

            if(i==3){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+(i*100)+"米");
        }
    }
}