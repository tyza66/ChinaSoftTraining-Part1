package 各种集合;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(1);
        ls.add(5);
        ls.add(3);
        ls.add(1);
        ls.add(null);
        //l中的元素也是根据进去的顺序的
        System.out.println(ls);
        System.out.println(ls);
    }
}
