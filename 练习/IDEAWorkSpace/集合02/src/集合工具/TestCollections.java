package 集合工具;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        Collections.rotate(a,1);
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println("打乱list: " + a);
        int frequency = Collections.frequency(a, 3);
        System.out.println("Frequency of 3: " + frequency);
        Collections.fill(a, 0);
        System.out.println("Filled list with 0: " + a);
    }
}
