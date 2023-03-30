package com.team.service.common;

public class Step {
    public static void next() {
        System.out.println("==========");
    }

    public static void next(int n) {
        for(int i=1;i<=n;i++){
            System.out.print("=");
        }
        System.out.println();
    }

    public static void longNext() {
        System.out.println("====================");
        System.out.println();
    }
}
