package 异常;

public class Test5 {

    public static void main(String[] args) {

        /*
        try{异常代码}catch(异常类型 变量){ 对异常的处理}finally{ 表示最终无论如何 都会执行的逻辑}
        finally的功能很强大，即便在return之后也会执行
        return: 语法 return之后的语句不会执行

        finally: 最终的，用在处理异常当中，和try..catch搭配使用
        final: 最终的，修饰变量，方法，类
        finalize: 方法，是java里面垃圾回收机制回收垃圾的方法
         */
       // aa();
        int result= bb();
        System.out.println(result);
    }

    public static void aa(){
        try{
            int m=10;
            int n=0;
            System.out.println(m/n);
        }catch (ArithmeticException e){
            System.out.println("出现数学异常啦");
        }finally {
            System.out.println("我一定会执行");
        }
    }

    public static int bb(){
        try {
            int m = 10;
            int n = 0;
            return m / n;
        }catch(Exception e){
            System.out.println("出现数学异常了");
            return 0;
        }finally {
            System.out.println("我会执行吗？ 同学们猜一猜");
        }
    }
}
