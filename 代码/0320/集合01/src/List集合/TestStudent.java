package List集合;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {
    public static void main(String[] args) {

        ArrayList lst=new ArrayList();

        Student s1=new Student("张三",23);
        Student s2=new Student("李四",25);
        Student s3=new Student("王五",33);
        Student s4=new Student("赵六",36);

        //添加学生
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        lst.add(s4);

        //lst.add(123);
        //求集合大小
        int size = lst.size();
        System.out.println("集合大小是："+size);

        //循环遍历
        //1. 普通for循环
        for(int i=0;i<lst.size();i++){
            Student s = (Student) lst.get(i);
            s.show();
        }

        System.out.println("--------------------");
        //forEach循环
        for(Object o:lst){
            Student s= (Student) o;
            s.show();
        }
        //iterator迭代器迭代
        System.out.println("---------------------");
        Iterator it = lst.iterator();
        while(it.hasNext()){//判断是否还有下一个元素
            Student s = (Student) it.next();
            s.show();

        }

        System.out.println("--------------------------");
        boolean flag = lst.remove(s4);
        System.out.println("删除后："+lst);

        //全部删除 全部清空
        lst.clear();
        System.out.println("清空后："+lst);
        System.out.println("是否是空？"+lst.isEmpty());

    }
}
