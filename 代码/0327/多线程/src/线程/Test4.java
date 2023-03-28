package 线程;

public class Test4 {
    public static void main(String[] args) {
        /*
        long getId()
返回此线程的标识符。
String getName()
返回此线程的名称。
int getPriority()
返回此线程的优先级。
Thread.State getState()
返回此线程的状态。
void setName(String name)
改变该线程的名称等于参数 name。
void setPriority(int newPriority
static Thread currentThread()
返回当前正在执行的线程对象的引用。

         */
        ThreadA t=new ThreadA();
        t.setName("A线程");
        t.setPriority(4);
        t.start();
    }
}
class ThreadA extends  Thread{
    @Override
    public void run() {

        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        System.out.println("id:"+Thread.currentThread().getId());
        System.out.println("name:"+Thread.currentThread().getName());
        System.out.println("优先级："+Thread.currentThread().getPriority());
        System.out.println("State:"+ Thread.currentThread().getState());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("bbbbbbbbbbbbbbbbbbbbb");
    }
}