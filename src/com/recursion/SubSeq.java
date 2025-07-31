package com.recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(subSeq("", "abc"));
        System.out.println(list);
    }

    public static ArrayList<String> subSeq(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            if (!p.isEmpty()) {
                String a ="";
                for (int i = 0; i < p.length(); i++) {
                    int dummy = (int) p.charAt(0);
                    a+= Integer.toString(dummy);
                }
                list.add(a);
            }


            return list;
        }

        char ch = up.charAt(0);
        ///  keep the ch - left
        ArrayList<String> left = (subSeq(p + ch, up.substring(1)));

        ArrayList<String> middle = (subSeq(p + ch, up.substring(1)));
        ///  removing the ch
        ArrayList<String> right = (subSeq(p, up.substring(1)));

///        left+right
        left.addAll(right);
        return left;
    }
}
