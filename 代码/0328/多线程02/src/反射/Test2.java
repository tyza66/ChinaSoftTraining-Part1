package 反射;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         //使用对象名获取
         Person p=new Person(1,"张三",23,"上海");
        Class<? extends Person> clazz1 = p.getClass();

        //使用类名获取，在类名加后缀 .class
        Class clazz2=Person.class;

         //使用类名获取，通过Class的静态方法forName()
        Class<?> clazz3 = Class.forName("反射.Person");

        System.out.println(clazz1==clazz2);//true
        System.out.println(clazz1==clazz3);//true


        //T newInstance()  创建类的实例
        Person p2 = clazz1.newInstance();
        p2.setId(2);
        p2.setName("lisi");
        p2.setAge(33);
        p2.setAddress("南京");
        p2.show();

    }
}
