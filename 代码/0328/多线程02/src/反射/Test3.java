package 反射;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException {

        Class clazz=Person.class;
        //获取所有的公共的构造方法
        //Constructor[] cons = clazz.getConstructors();
        //Constructor<?>[] getDeclaredConstructors()   获取所有的构造方法
        Constructor[] cons = clazz.getDeclaredConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }

        //Constructor<T> getConstructor(Class...   parameterTypes)：通过指定参数类型，返回构造方法实例
        Constructor conn = clazz.getConstructor(int.class, String.class, int.class, String.class);
        System.out.println("构造方法："+conn);
        System.out.println("构造方法名称："+conn.getName());

        //getPackage()  获取此类的包
        Package pack = clazz.getPackage();
        System.out.println("包名是："+pack);

        //int getModifiers()   获取类的修饰符
        int modifiers = clazz.getModifiers();
        System.out.println("修饰符的值是："+modifiers);
    }
}
