package 线程;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(111);
        //static void sleep(long millis)  让线程休眠指定的时间 单位 毫秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(222);
    }
}
