package 文件作业;

import java.io.File;

public class 文件作业2 {
    public static void main(String[] args) {
        文件作业2 f = new 文件作业2();
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\文件作业";
        f.allChildren(path);
    }

    public void allChildren(String path) {
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File i : files) {
                //System.out.println(i.toString());
                if (i != null && i.isFile()) {
                    String name = i.getName();
                        System.out.println(name);
                } else if (i != null) {
                    allChildren(i.getPath());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
