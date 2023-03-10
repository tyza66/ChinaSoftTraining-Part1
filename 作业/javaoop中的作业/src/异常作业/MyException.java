package 异常作业;

public class MyException extends Exception {
    String info;

    public MyException(String info) {
        this.info = info;
    }

    public void ping() {
        System.out.println("PONG");
    }

    public void showInfo() {
        System.out.println(info);
    }
}
