package com.String_Concepts;

public class Missing_Palindrome {
    public static void main(String[] args) {
        String s = "abcddcb";
        for(int i=0; i<=s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()- i )){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
