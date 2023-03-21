package set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            System.out.print(i+" ");
        }
    }
}
