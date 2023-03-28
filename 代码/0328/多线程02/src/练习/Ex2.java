package 练习;

public class Ex2 {
    public static void main(String[] args) {
        //建立3个线程，A线程打印10次A;B线程打印10次B；C线程打印10次C；
        // ABCABCABC....
        /*要求：  线程同时运行，交替打印10次ABC
                ABCABCABC
        A执行，A把B唤醒，A等待；B执行，B再把C唤醒，B等待；C执行，C再把A唤醒，C等待；依次循环
        每个线程都是前面一个线程把他唤醒的，自身执行之后吧下一个唤醒，自身等待wait
        ------
        A --->notify() B  A wait()---->B执行  notify() C   B wait()
        */

        Object a=new Object();
        Object b=new Object();
        Object c=new Object();
        ThreadZ ta=new ThreadZ("A",c,a);
        ThreadZ tb=new ThreadZ("B",a,b);
        ThreadZ tc=new ThreadZ("C",b,c);
        ta.start();
        tb.start();
        tc.start();


    }
}
class ThreadZ extends Thread{

    private String name;
    private Object prev;//前一个锁，用于吧后面的给唤醒
    private Object self;//自身的锁 ，用于执行；执行完之后吧下一个唤醒，自己等待

    public ThreadZ(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count=10;
        while(count>0){
            synchronized (prev){
                synchronized (self){
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
