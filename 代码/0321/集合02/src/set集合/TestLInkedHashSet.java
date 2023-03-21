package set集合;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLInkedHashSet {
    public static void main(String[] args) {
        // 元素不重复，唯一的；按照插入顺序迭代
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(null);
        set.add(null);
        set.add(5);
        for(int i=10;i>0;i--){
            set.add(i);
        }
        set.add(3);

        System.out.println("set集合大小是："+set.size());
        System.out.println("set集合："+set);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.print(next+" ");
        }
    }
}
