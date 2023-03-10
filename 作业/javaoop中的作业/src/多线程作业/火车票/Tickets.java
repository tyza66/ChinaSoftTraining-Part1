package 多线程作业.火车票;

public class Tickets {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(new TicketWindow());
        t1.setName("窗口1");
        Thread t2 = new Thread(new TicketWindow());
        t1.setName("窗口1");
        Thread t3 = new Thread(new TicketWindow());
        t1.setName("窗口1");
        Thread t4 = new Thread(new TicketWindow());
        t1.setName("窗口1");
    }
}

class Ticket {
    private int amount;

    public Ticket() {
        amount = 100;
    }

    public int getAmount() {
        return amount;
    }

    public void sale() {
        amount -= 1;
    }
}

class TicketWindow implements Runnable {
    @Override
    public void run() {

    }
}
