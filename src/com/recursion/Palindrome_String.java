package com.recursion;

public class Palindrome_String {
    public static void main(String[] args) {
        String s = "madm";
        boolean a = isPalindrome(0,s);
        System.out.println(a);
    }

    private static boolean isPalindrome(int i,String s) {
        //base condition
        if(i>=s.length()/2){
            return true;
        }
        // check condition
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindrome(i+1,s);
    }
}
