import java.util.HashMap;

/**
 * Author: tyza66
 * CreateTime: 2023-03-31 15:19
 * Github: https://github.com/tyza66
 */
public class Hash {
    public static void main(String[] args) {
        HashMap<Integer,String> a=new HashMap();
        a.put(0,"0");
        a.put(1,"1");
        a.put(2,"2");
        a.put(3,"3");
        a.put(4,"4");
        for(int i=0;i<=4;i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
