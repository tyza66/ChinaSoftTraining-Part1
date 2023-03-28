package 线程;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Test5 {
    public static void main(String[] args) {

        /*
         public static final int MAX_PRIORITY 10
 public static final int MIN_PRIORITY 1
 public static final int NORM_PRIORITY 5
         */
        ThreadC t1=new ThreadC();
        t1.setName("猫");
        t1.setPriority(Thread.MIN_PRIORITY);//最小优先级 1

        ThreadC t2=new ThreadC();
        t2.setName("狗");
        t2.setPriority(Thread.MAX_PRIORITY);//最大优先级 10

        ThreadC t3=new ThreadC();
        t3.setPriority(Thread.NORM_PRIORITY);//正常优先级  5
        t3.setName("猪");

        t1.start();
        t2.start();
        t3.start();
    }
}
class ThreadC extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
