package 面对对象之前;

import sun.awt.windows.WPrinterJob;

public class 乘法口诀打印 {
    public static void main(String[] args) {
        //乘法口诀表打印如下
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j < i) {
                    System.out.print("\t\t");
                }else{
                    System.out.print("\t"+i+"*"+j+"="+i*j);
                }
            }
            System.out.println();
        }
    }
}
