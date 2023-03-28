import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person> personClass = Person.class;
        //获得public的构造方法
        Constructor<?>[] constructors = personClass.getConstructors();
        for(Constructor<?> one:constructors){
            System.out.println(one);
        }
        //获得所有的构造方法
        Constructor<?>[] constructors2 = personClass.getDeclaredConstructors();
        for(Constructor<?> one:constructors2){
            System.out.println(one);
        }
        //获得有指定参数的构造方法
        Constructor<?> constructor3 = personClass.getConstructor(int.class,String.class);
        System.out.println(constructor3);
        //获得所在的包
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
        //获得权限修饰符的和
        int modifiers = personClass.getModifiers();
        System.out.println(modifiers);
    }
}
