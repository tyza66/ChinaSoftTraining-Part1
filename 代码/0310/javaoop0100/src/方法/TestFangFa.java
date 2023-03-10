package 方法;

public class TestFangFa {

    public static void main(String[] args) {
        //System.out.println("hello world");

      aa();
      bb();
      /*
      类名 对象名=new 类目();
      对象名.属性
      对象名.方法
       */
        TestFangFa t=new TestFangFa();
        t.study();

        t.eat("米饭");
        t.add(23,56);

        //返回值只是返回到系统里面，可以使用一个变量来接受函数的返回值
        String name = t.showName("李四");
        System.out.println(name);

        int sub = t.sub(23, 11);
        System.out.println(sub);

    }

    // aa() 表示函数名  函数名都带()
    /*
    public :公共的，表示再任何地方都能访问；访问权限最大；
    void： 空的，无效的； 表示该函数灭有返回值
    static: 静态的，修饰方法 表示静态方法，类方法，属于该类所有，调用的时候直接写方法名就可以调用
     */
    //无参的行数  就是()里面没有参数
    public static void aa(){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void bb(){
        System.out.println("bbbbbbbbbbbbbbbbbbbbb");
    }
    //没有加static,就是一个普通方法,必须油该类的对象来调用
    public void study(){
        System.out.println("小明在学习");
    }


    //有参的方法   参数可以是0个或任意多个
    /*
    定义的时候传入的参数叫形参； 调用的时候传入的参数叫实参
    实参的类型和个数必须和形参保持一致
     */
    //没有返回值的方法
    public void eat(String str){
        System.out.println("小明再吃"+str);
    }

    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    /*
    有返回值的话，方法前面就必须写上返回值类型，返回的值的类型必须符合返回值类型;
    返回值再方法最后通过return返回回来,return后面的逻辑不会执行
     */
    public String showName(String name){
        return name;
        //System.out.println("aaaaaaaaaaaaaaaaaaaa");//return后面的逻辑不会执行
    }

    public int sub(int n1,int n2){
        return  n1-n2;
    }


}
