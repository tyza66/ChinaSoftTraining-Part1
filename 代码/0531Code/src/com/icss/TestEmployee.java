package com.icss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
//        实例化两个员工对象，分别添加相应数据，把2个员工信息封装到ArrayList，将ArrayList中的员工信息输出（使用泛型和for each）（7分）
        Employee e1 = new Employee("tom",1500);
        Employee e2 = new Employee("jack",2000);

        List<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);

//        删除tom员工
//        list.remove(e1);
//          list.remove(0);
        /*for (int i = 0; i < list.size(); i++) {
            if ("tom".equals(list.get(i).getName())) {
                 list.remove(i);
            }
        }*/
//        修改员工的姓名和工资
         list.set(0,new Employee("rose",3000));
//        遍历list集合  ② 利用下标进行遍历  ③ 利用迭代器遍历

       for(Employee tmp : list){
            System.out.println(tmp);
        }

       /*  list.forEach((tmp)->{
            System.out.println(tmp);
        });*/

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()){
            Employee e = iterator.next();
            System.out.println( e.getName() + "---" + e.getSalary());
        }


//        将以上2为员工的薪水加1000并同步到集合中输出新信息（6分）
        for (Employee tmp : list) {
            tmp.setSalary(tmp.getSalary() + 1000);
            System.out.println("增加工资后 " + tmp);
        }
    }
}
