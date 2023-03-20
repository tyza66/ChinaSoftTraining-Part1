package List集合;

import java.util.ArrayList;

public class TestArrayList03 {

    public static void main(String[] args) {

        //没加泛型 里面放的是Object类型
        ArrayList list=new ArrayList();
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(67);
        list.add("aaa");


        //泛型： 限定集合里面只能存放某种类型的数据
        // ArrayList<泛型类型> list2=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
      //  list2.add(123);//报错 不能存放非String类型

        String str = list2.get(1);
        System.out.println(str);

        //泛型里面不能是基本数据类型，只能是他们的包装类
        ArrayList<Integer> list3=new ArrayList();
        list3.add(12);
    }
}
