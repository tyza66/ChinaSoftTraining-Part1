package 异常作业;

public class MyExceptionTest {
    public static void main(String[] args) {
        try{
            MyException e = new MyException("giao");
            throw e;
        }catch(MyException e){
            e.showInfo();
            e.ping();
        }
    }
}
