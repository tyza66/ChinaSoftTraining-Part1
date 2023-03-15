public class StringTest {
    public static void main(String[] args) {
        String str1 = "giao";
        boolean flag = str1.contains("o");
        System.out.println(flag);
        String str2 = new String("shenqi");
        String str3 = str2.replaceFirst("qi","giao");
        System.out.println(str3);
    }
}
