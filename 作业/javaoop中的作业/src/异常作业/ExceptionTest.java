package 异常作业;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("giao");
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
