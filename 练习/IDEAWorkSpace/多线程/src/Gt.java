public class Gt {
    public static void main(String[] args) {
        G t1 = new G();
        T t2 = new T();
        t1.setName("龟");
        t2.setName("兔");
        t2.t = t1;
        t1.start();
        t2.start();
    }
}

class G extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"m");
        }
    }
}

class T extends Thread{
    static Thread t;
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(i==3){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"m");
        }
    }
}