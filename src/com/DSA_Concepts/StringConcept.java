package com.DSA_Concepts;
public class StringConcept {
    public static void main(String[] args) {
        String name = "jayamadhavan";
        String names = "jayamadhavan";
//        System.out.println(name.equals(names));

        String str1 = new String ( "Jayamadhavan");
        String str2 = new String ("Jayamadhavan");
        //checking the object are same ?
        System.out.println(str1  == str2);
        //it will check the value in the variable;
        System.out.println(str1.equals(str2));
    }
}
