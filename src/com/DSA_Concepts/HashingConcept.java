package com.DSA_Concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashingConcept {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 4, 7, 3, 2, 1, 78, 5, 5, 5, 5, 5};

        /// hashing for Number

//        removeDuplicateFromArr(arr);

        ///  Hashing For Alphabet

        // ASCII values (AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE )
        /*
            A-Z (65 to 90)
            a-z (97 to 122)
         */
        String myString = "jayamadhavan";

//        countAlphabet(myString);

        /// HapMap concept to Reduces the Space Complexity

        hashmaps(arr);
    }

    static void hashmaps(int[] arr) {
        // Initializing hashMap before that import HashMap

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int j : arr) {
            int count = 1;
            if (maps.containsKey(j)) {
                count += maps.get(j);
                maps.put(j, count);
            } else {
                maps.put(j, count);
            }
        }
        //or
        /*
        for (int num : arr) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

         */
        // keySet()
        System.out.println("Keys: " + maps.keySet());

        // values()
        System.out.println("Values: " + maps.values());

        // print in format
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }

    public static void countAlphabet(String myString) {
        // Converting String into char Array

        char[] charArr = myString.toLowerCase().toCharArray();

        // creating an hashCharArray

        int[] hArr = new int[256];

        for (int i : charArr) {
            hArr[(i - 'A')]++;
        }
        System.out.println();
        char j = 65;
        for (int i : hArr) {
            System.out.print(j++ + " " + i + " ");
        }

    }

    static void removeDuplicateFromArr(int[] arr) {
        int len = arr.length;
        System.out.println(Arrays.toString(arr));
        ///  to find the max
        int maxValue = maxvalue(arr);

        // create a hash array

        int[] hashArr = new int[maxValue + 1];
        int i = 0;
        while (i < len) {
            hashArr[arr[i]]++;
            i++;
        }
        System.out.println(Arrays.toString(hashArr));
        int index = 0;
        while (index < hashArr.length) {
            if (hashArr[index] > 1) {
                System.out.print(index + " ");
            }
            index++;
        }
    }

    static int maxvalue(int[] arr) {
        int len = arr.length;
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i < len) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }


}
