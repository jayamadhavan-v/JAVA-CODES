package com.Basic_Problems;

import java.util.Scanner;

public class skip_character {
    public static void main(String[] args) {
        String input =
//                new Scanner(System.in).nextLine();
        "abbacdcc";
        char ele =
//                new Scanner(System.in).next().charAt(0);
                'a';
        skipCharacter(input, ele);
    }

     static void skipCharacter(String input, char ele) {
        // using the StringBuider
         StringBuilder sb = new StringBuilder();
         int i=0;
        while(i<input.length()){
            if(input.charAt(i)!= ele){
                sb.append(input.charAt(i));
            }
            i++;
        }
         System.out.println(sb);
     }
}
