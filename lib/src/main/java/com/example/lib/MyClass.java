package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] avg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("請輸入生日年月日:");
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(y+"."+m+"."+d);
    }
}
