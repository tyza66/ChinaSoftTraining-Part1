package 作业;

public class Zy1 {

    public static void main(String[] args) {

        try {
            throw new Exception("出现异常啦");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("我真正达到这里");
        }
    }
}
