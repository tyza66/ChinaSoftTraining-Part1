package 多线程作业.火车票;

public class Tickets {
    public static Ticket ticket = new Ticket(1000);

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(new TicketWindow());
        t1.setName("窗口1");
        Thread t2 = new Thread(new TicketWindow());
        t2.setName("窗口2");
        Thread t3 = new Thread(new TicketWindow());
        t3.setName("窗口3");
        Thread t4 = new Thread(new TicketWindow());
        t4.setName("窗口4");
        t1.start();t2.start();t3.start();t4.start();
    }
}

class Ticket {
    private int amount;

    public Ticket(int i) {
        amount = i;
    }

    public Ticket() {
        amount = 100;
    }

    public int getAmount() {
        return amount;
    }

    public void sale() {
        System.out.println(amount);
        amount -= 1;
    }
}

class TicketWindow implements Runnable {
    @Override
    public void run() {
        synchronized (Tickets.ticket) {
            while (Tickets.ticket.getAmount() > 0) {
                Tickets.ticket.notify();
                System.out.print(Thread.currentThread().getName()+":");
                Tickets.ticket.sale();
                try {
                    Tickets.ticket.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (Tickets.ticket.getAmount() <= 0){
                    System.out.println("票已经卖完了！");
                }
            }
        }
    }
}
