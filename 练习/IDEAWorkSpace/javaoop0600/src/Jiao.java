import sun.java2d.pipe.OutlineTextRenderer;

import java.util.function.DoubleToIntFunction;

public class Jiao extends Giao implements Miao,Wang{

    @Override
    public void giao2() {
        System.out.println("giao2");
    }

    @Override
    public void miao1() {
        System.out.println("miao1");
    }

    @Override
    public void miao2() {
        System.out.println("miao2");
    }

    @Override
    public void wang1() {
        System.out.println("wang1");
    }

    @Override
    public void wang2() {
        System.out.println("wang2");
    }
}
