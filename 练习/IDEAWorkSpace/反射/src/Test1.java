public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //第一种方法
        Person p = new Person(1,"xm");
        Class<? extends Person> aClass = p.getClass();
        //第二种反方
        Class<Person> personClass = Person.class;
        //第三种方法
        Class<?> person = Class.forName("Person");

        //三种获得的是同一个由类加载器产生的Class对象
        System.out.println(aClass==personClass);
        System.out.println(aClass==person);

        Person person1 = aClass.newInstance();
        person1.id = 3;
        person1.name = "xl";
        person1.show();
    }
}
