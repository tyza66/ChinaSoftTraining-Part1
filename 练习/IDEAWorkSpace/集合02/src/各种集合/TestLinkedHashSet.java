package 各种集合;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(1);
        ls.add(null);
        System.out.println(ls);
        System.out.println(ls);
    }
}
