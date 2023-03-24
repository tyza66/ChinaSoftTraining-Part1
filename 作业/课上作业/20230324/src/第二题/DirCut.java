package 第二题;

import java.io.*;

public class DirCut {
    public static void main(String[] args) {
        String old = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\被剪切文件件1";
        String optiion = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\粘贴处";
        try {
            new DirCut().dirCutDown(old, optiion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //文件夹的剪切
    public void dirCutDown(String old, String end) throws IOException {
        dirCopyDown(old, end);
        File file = new File(old);
        deleleFile(file);
        deleleDir(file);
        file.delete();
    }

    //文件夹的复制 old是要复制的文件件路径 end是要放在哪个文件夹里
    public void dirCopyDown(String old, String end) throws IOException {
        //文件夹是一个树的结构其实 我们要走到树干复制树干（文件夹） 走到果子复制果子（文件）
        //获得要剪切的原始文件夹和要输出的目标文件夹上级目录或者文件位置
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

    public void deleleFile(File f){
        File[] fs = f.listFiles();
        for(File one:fs){
            if(one.isFile()){
                one.delete();
            }else{
                deleleFile(one);
            }
        }
    }

    public void deleleDir(File f){
        File[] fs = f.listFiles();
        for(File one:fs){
            if(one.isDirectory()){
                deleleDir(one);
                one.delete();
            }
        }
    }
}
