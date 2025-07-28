package com.recursion;

public class Skip_String {
    public static void main(String[] args) {
        String a = "i love u teju";
        System.out.println(skipString(a,"teju"));;
    }

    static String skipString(String a, String teju) {
        if(a.length()==0){
            return"";
        }
        if(a.startsWith(teju)){
            return skipString(a.substring(teju.length()),teju);
        }else {
            return a.charAt(0)+skipString(a.substring(1),teju);
        }
    }
}
