package com.recursion;

public class skip_Character {
    public static void main(String[] args) {
        String s = "abacaadaeaf";
        String b = skipCharacter(s,'a');
        System.out.println(b);
    }

    static String skipCharacter(String s, char a) {

        if(s.length()==0){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == a){
          return skipCharacter(s.substring(1),a);
        }else {
            return ch+ skipCharacter(s.substring(1), a);
        }
    }
}
