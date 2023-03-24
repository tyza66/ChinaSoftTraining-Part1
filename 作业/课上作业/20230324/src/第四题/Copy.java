package 第四题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        String old = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\被复制文件夹2";
        String optiion = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\粘贴处";
        try {
            new Copy().dirCopyDown(old, optiion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void dirCopyDown(String old, String end) throws IOException {
        File fold = new File(old);
        File fend = new File(end);
        if (fold.isDirectory()) {
            new File(end + "\\" + fold.getName()).mkdir();
            for (File f : fold.listFiles()) {
                dirCopyDown(f.getAbsolutePath(), fend.getAbsolutePath() + "\\" + fold.getName());
            }
        } else {
            FileInputStream in = new FileInputStream(fold);
            FileOutputStream out = new FileOutputStream(fend + "\\" + fold.getName());
            int buffer = 0;
            while ((buffer = in.read()) != -1) {
                out.write(buffer);
            }
            in.close();
            out.close();
        }
    }
}
