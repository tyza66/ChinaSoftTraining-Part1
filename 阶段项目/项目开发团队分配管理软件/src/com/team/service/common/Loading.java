package com.team.service.common;

import java.util.Random;

public class Loading {
    public static void loadSpecialEffects() throws InterruptedException {
        for (int i1 = 1; i1 <= 100; i1++) {
            System.out.print("加载中：" + i1 + "%");
            Thread.sleep(new Random().nextInt(25) + 1);
            if (i1 == 100) {
                Thread.sleep(50);
            }
            System.out.print("\r");
        }
        System.out.print("\r");
    }
}
