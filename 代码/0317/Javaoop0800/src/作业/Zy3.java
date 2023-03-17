package 作业;

public class Zy3 {
    public static void main(String[] args) {
        Test t=new Test();

        try {
            t.ceshi();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.show();
        }
    }
}

class MyException extends Exception{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public void show(){
        System.out.println("出现异常啦");
    }
}
class Test{
    public void ceshi() throws MyException {
        throw new MyException("出现了我定义的异常信息啦");
    }
}