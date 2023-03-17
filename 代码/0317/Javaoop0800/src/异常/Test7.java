package 异常;

public class Test7 {

    public static void main(String[] args) {

        /*
        处理异常的两种方式：
        1. try{}catch(){}    try{}catch(){}finally{}   主动捕获，主动处理异常
        2. throws  写在方法签名后面  被动抛出; 不建议在main方法里面抛出，那样会抛给虚拟机

        产生，制造一个异常
        throw 异常对象； 她必须和try..catch或者throws搭配使用

        e.printStackTrace(): 打印异常出错的堆栈信息
        e.getMessage() 返回该错误的详细信息的字符串

         */
       // aa();

       /* try {
            bb();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }*/

        cc();


    }

    public static void aa(){
        try {
            throw new Exception("出现异常了");
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("异常被处理了");
            System.out.println(e.getMessage());
        }
    }

    public static void bb() throws Exception {
        throw new Exception("出现异常了");
    }

    public static void cc() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        //System.out.println(12/0);
        throw new ArithmeticException("出现数学一场啦");
    }
}
