public class TestThread {
    public static void main(String[] args) {
        new T1().start();
        new Thread(new T2()).start();
    }
}
class T1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("ping");
        }
    }
}
class T2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("pong");
        }
    }
}