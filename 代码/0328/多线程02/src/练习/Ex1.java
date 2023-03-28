package 练习;

public class Ex1 {
    public static void main(String[] args) {
        /*1.火车票售票系统是一个常年运行的系统，为了保证乘客能购到票，一般设置多个窗口：

        假设有100张票，4个窗口卖票，分别打印出每个窗口卖的票*/
        ThreadH th1=new ThreadH();
        th1.setName("窗口1");
        ThreadH th2=new ThreadH();
        th2.setName("窗口2");
        ThreadH th3=new ThreadH();
        th3.setName("窗口3");
        ThreadH th4=new ThreadH();
        th4.setName("窗口4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();


    }
}
class Ticket{
    private int amount;

    public Ticket(){
        this.amount=100;
    }

    public int getAmount() {
        return amount;
    }

    public void sale(){
        amount--;
    }
}

class ThreadH extends Thread{
    private static  Ticket ticket=new Ticket();

    @Override
    public void run() {
        while(true){
            synchronized (ticket){
                if(ticket.getAmount()<1){
                    System.out.println("票已经卖完了");
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName()+"卖第"+ticket.getAmount()+"张票");
                    ticket.sale();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}