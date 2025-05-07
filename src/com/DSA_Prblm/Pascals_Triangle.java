package com.DSA_Prblm;

import java.util.ArrayList;
import java.util.List;

/// [...](https://leetcode.com/problems/pascals-triangle/description/)
/// 06/may/2025
public class Pascals_Triangle {
    public static void main(String[] args) {

        Solution1 s = new Solution1();
        // [...](https://leetcode.com/problems/pascals-triangle/description/)
        ArrayList<ArrayList<Integer>> myList = s.printIt(3);
        System.out.println(myList);
        //[...](https://leetcode.com/problems/pascals-triangle-ii/description/)
        List<Integer> myList2 = s.getRow(3);
        System.out.println(myList2);
    }
}

class Solution1 {

//    --> Printing Entire Array

    public ArrayList<ArrayList<Integer>> printIt(int rowNumber) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= rowNumber; i++) {
            list.add(NCR_Method(i));
        }
        return list;
    }

//  --> NCR_Method

    public ArrayList<Integer> NCR_Method(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans = 1;
        arr.add(ans);
        for (int i = 1; i < n; i++) { // I Want to start with 1 otherwise it will give error in line 16
            ans = ans * (n - i) / (i);
            arr.add(ans);
        }
        return arr;
    }

//   --> for a single row matrix

    public List<Integer> getRow(int n) {

        List<Integer> arr = new ArrayList<>();
        long ans = 1;
        arr.add((int) ans);
        for (int i = 1; i <= n; i++) { //
           ans  = ans  * (n-i+1);
           ans = ans / i ;
            arr.add((int) ans);
        }
        return arr;
    }

}
