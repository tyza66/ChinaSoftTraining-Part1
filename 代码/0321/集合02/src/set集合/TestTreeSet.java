package set集合;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        //TreeSet自带对元素排序功能，不重复的
        TreeSet<Character> ts1=new TreeSet<>();
        ts1.add('z');
        ts1.add('r');
        ts1.add('t');
        ts1.add('c');
        ts1.add('f');
        ts1.add('r');
        //ts1.add(null);

        System.out.println("ts1:"+ts1);
        System.out.println("treeset大小是："+ts1.size());
        //E first()  返回第一个元素 最小的元素
        System.out.println("最小的元素是："+ts1.first());
        //E last()   返回最后一个元素 最大的元素
        System.out.println("最大的元素是："+ts1.last());

        //E pollFirst()   查询 并移除第一个元素
        System.out.println("查询并移除第一个元素："+ts1.pollFirst());
        System.out.println("移除后："+ts1);

        //E pollLast()  查询并移除最后一个元素
        System.out.println("查询并移除最后一个元素："+ts1.pollLast());
        System.out.println("移除后："+ts1);

        //boolean remove(Object o)   删除某个元素对象
        ts1.remove('r');
        System.out.println("删除后："+ts1);

        //void clear()   清空集合
        ts1.clear();
        System.out.println("清空后："+ts1);
        System.out.println("是否为空？"+ts1.isEmpty());

        //对对象进行排序，类必须实现Comparable接口
        TreeSet<Person> ts2=new TreeSet<>();
        Person p1=new Person("zhangsna",23);
        Person p2=new Person("lisi",18);
        Person p3=new Person("lisi",24);
        Person p4=new Person("zhaoliu",34);
        ts2.add(p1);
        ts2.add(p2);
        ts2.add(p3);
        ts2.add(p4);
        System.out.println(ts2);
        //循环遍历
        for(Person p:ts2){
            System.out.println(p);
        }
    }
}
class Person implements Comparable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int n=0;
        int result=0;
        if(o instanceof  Person){
            Person p= (Person) o;
            n= this.name.compareTo(p.name);//先比较姓名是否相等
            result=n==0?this.age-p.age:n;//姓名相等再比较年龄
        }
        return result;
    }
}