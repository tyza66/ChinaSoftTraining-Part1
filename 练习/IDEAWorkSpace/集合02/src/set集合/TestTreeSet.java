package set集合;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(2);
        System.out.println(s);
    }
}
