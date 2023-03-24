package 第六题;

import java.io.*;

public class GBKtoUTF8 {
    public static void main(String[] args) {
        String old = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\编码是GBK的文件.txt";
        String newPath = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324";
        try {
            change(old, newPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void change(String old, String newOnePath) throws IOException {
        File i0 = new File(old);
        File i1 = new File(newOnePath + "\\utf8-" + i0.getName());
        InputStreamReader s1 = new InputStreamReader(new FileInputStream(i0), "GBK");
        OutputStreamWriter s2 = new OutputStreamWriter(new FileOutputStream(i1), "UTF-8");
        int temp = 0;
        while ((temp = s1.read()) != -1) {
            s2.write(temp);
        }
        s1.close();
        s2.close();
    }
}
