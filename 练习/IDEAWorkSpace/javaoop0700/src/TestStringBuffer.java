public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("giao");
        String ss2 = "hello";
        StringBuffer s2 = new StringBuffer(ss2);
        StringBuffer reverse = s1.reverse();
        System.out.println(reverse);
    }
}
