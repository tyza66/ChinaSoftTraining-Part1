package 文件作业;

import java.io.File;

public class 文件作业2 {
    int sum;
    int sum2;
    public static void main(String[] args) {
        文件作业2 f = new 文件作业2();
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\文件作业";
        f.allChildren(path);
        System.out.println("一共有" + f.sum + "个java文件");
        System.out.println("一共有" + f.sum2 + "个目录");
    }

    public void allChildren(String path) {
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File i : files) {
                //System.out.println(i.toString());
                if (i != null && i.isFile()) {
                    String name = i.getName();
                    String nameEnd = name.split("[.]")[name.split("[.]").length - 1];
                    if (nameEnd.equals("java")) {
                        sum++;
                    }
                    System.out.println(name);
                } else if (i != null) {
                    allChildren(i.getPath());
                    sum2++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
