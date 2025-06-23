package com.skillrack;

public class Interlace {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 11;
//        int c = a, d = b;
//        while (b>=a) {
//            if (c % 2 != 0) {
//                System.out.print(c + " ");
//            }
//            if (d % 2 == 0) {
//                System.out.print(d + " ");
//            }
//            c++;
//            d--;
//            b--;
//        }
        String s = "AnbU";
        int a = 0, c = 0;
        while (a < s.length()) {
            int b = (int) s.charAt(a);
            if (b >= 65 && b <= 90) {
                c++;
            }
            a++;
        }
        System.out.println(c);

        for (int i = 65;i <= 90; i++) {
            System.out.print((char) i+ " ");
        }
    }

}
