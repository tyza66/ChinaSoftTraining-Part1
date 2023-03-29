package jdk8新特性.Lambda表达式;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        sort3();
    }


    //老版本Java排序
    public static void sort1() {
        List<String> names = Arrays.asList("peter", "anan", "mike", "anglua");
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //倒叙排序
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);
    }

    public static void sort2() {
        List<String> names = Arrays.asList("peter", "anan", "mike", "anglua");
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //倒叙排序
        //lambda表达式
        Collections.sort(names, (String a,String b)->{
            return b.compareTo(a);
        });

        System.out.println(names);
    }

    public static void sort3() {
        List<String> names = Arrays.asList("peter", "anan", "mike", "anglua");
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //倒叙排序
        //lambda表达式 如果{} 里面只有一行代码 ，{}和return都可以身略
        Collections.sort(names, (String a,String b)->
             b.compareTo(a)
        );

        System.out.println(names);
    }
    public static void sort4() {
        List<String> names = Arrays.asList("peter", "anan", "mike", "anglua");
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //倒叙排序
        //lambda表达式 如果{} 里面只有一行代码 ，{}和return都可以身略
        //参数类型可以省略，java编译器会的自动推导出里面的类型
        Collections.sort(names, ( a, b)->
                b.compareTo(a)
        );

        System.out.println(names);
    }
}
