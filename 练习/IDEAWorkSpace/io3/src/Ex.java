import java.io.*;

public class Ex {
    //实现文件剪切
    public static void main(String[] args) {
        //复制 再删除原来的文件
        String s1 = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\io3\\用来剪切的文件";
        String s2 = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\io3\\粘贴处";
        cut(new File(s1),new File(s2));
    }

    //先要写一个复制文件的功能
    public static void copy(File src, File tar) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(tar);
        int buffer = 0;
        while ((buffer = in.read()) != -1) {
            out.write(buffer);
        }
        in.close();
        out.close();
    }

    //接下来我们要写一个剪切文件夹 并借助复制文件
    public static void cut(File src, File tar) {
        //先判断当前要剪切的文件夹存在不存在 没有就不执行了
        if (!src.exists()) {
            System.out.println("文件夹不存在");
            return;
        }
        //判断目标位置的父文件夹是否存在 没有就创建
        if (!tar.exists()) {
            tar.mkdirs();
        }
        //如果当前是文件 就直接复制到目标文件件同名文件
        if (src.isFile()) {
            File target = new File(tar, src.getName());
            try {
                copy(src, target);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //如果当前是目录，就先复制目录文件夹，再进行递归
        else if (src.isDirectory()) {
            File target = new File(tar, src.getName());
            target.mkdirs();
            File[] files = src.listFiles();
            for (File f : files) {
                cut(f, target);
            }
        }
        //删除文件或空目录
        src.delete();
    }
}
