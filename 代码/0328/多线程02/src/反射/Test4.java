package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class<?> clazz = Class.forName("反射.Person");
        //获取属性
        //Field id = clazz.getField("id");
        Field id = clazz.getDeclaredField("id");
        System.out.println("属性名："+id);

        //getName() getType()
        System.out.println(id.getName());
        System.out.println(id.getType());
        System.out.println(id.getModifiers());

        System.out.println("-------------");
       // Field[] fields = clazz.getFields();//获取所有的公共的属性
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }

        System.out.println("---------------------------");
        //获取show方法
        Method show = clazz.getMethod("show", null);
        System.out.println("方法是："+show);

        System.out.println("------------------");
        //获取所有的公共的方法
        //Method[] methods = clazz.getMethods();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method);
            System.out.println("方法名是："+method.getName());
            System.out.println("修饰符是："+method.getModifiers());
            System.out.println("返回值类型："+method.getReturnType());
        }

    }
}
