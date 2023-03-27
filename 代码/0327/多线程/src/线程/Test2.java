package 线程;

public class Test2 {
    public static void main(String[] args) {
        /*
        	线程： 程序执行流的最小单位
		程序： 磁盘上的应用程序  一个程序可能有多个进程组成
		进程： 正在运行中的程序  一个进程可能由多个线程组成

		java.lang.Thread
		创建线程2中方式 run() 方法L线程的主执行方法，程序必须放在run（）方法才能得以执行
		start(): 启动该线程的方法，让线程执行run()方法里面的逻辑
		1. 继承Thread类

		    class 线程类 extends  Thread{
		        public void run(){

		        }
		    }
		    线程类 对象=new 线程类();
		    对象.start();

		2. 实现Runnable接口
            class 线程类 implements Runnable{
                public void run(){

                }
            }
            线程类 对象=new 线程类();
            new Thread(对象).start()

         */
        Music m=new Music();
        m.start();

        Voice v=new Voice();
        new Thread(v).start();
    }


}
//继承方式
class Music extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
    }
}
//重写Runnable接口
class Voice implements Runnable{
    @Override
    public void run() {
        for(char ch='A';ch<='z';ch++){
            System.out.print(ch+" ");
        }
    }
}