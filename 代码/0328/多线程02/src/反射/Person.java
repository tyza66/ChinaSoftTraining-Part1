package 反射;

public final class Person {
     int id;
    public String name;
    int age;
    String address;


    Person() {
    }

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

     void setAddress(String address) {
        this.address = address;
    }

    public void show() {
        System.out.println("编号：" + id + " 姓名：" + name + " 年龄：" + age + " 地址：" + address);
    }
}
