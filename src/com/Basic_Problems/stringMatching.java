package com.Basic_Problems;

public class stringMatching {
    public static void main(String[] args) {
        String s1 = "tomato";
        String s2 = "to";
        int cnt = 0;
        for (int i = 0; i <= s1.length()-2; i++) {
            String sub = s1.substring(i,i+2);
            if(sub.equals(s2)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
