package com.Basic_Problems;

class Palindrome_String{
    public static void main(String[] args) {
        String n = "er";
        System.out.println( isPalindrome(n));
    }
    public static boolean isPalindrome(String n){
        int len = n.length();
        for (int i = 0; i < len/2; i++) {
            if(n.charAt(i) != n.charAt(len-i-1) ){
                return false;
            }
        }
        return true;
    }
}
