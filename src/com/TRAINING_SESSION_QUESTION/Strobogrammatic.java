package com.TRAINING_SESSION_QUESTION;

import java.util.*;

public class Strobogrammatic {
    public static void main(String[] args) {
        String n = "9006";
        System.out.println("Is " + n + " is Strobogrammatic? " + is_Strobogrammatic(n));
    }
    // Method to check if the given string is Strobogrammatic
    public static boolean is_Strobogrammatic(String n) {
        // Check for null or empty string
        if (n == null || n.length() == 0) {
            return true;
        }
        // Create a HashMap to store Strobogrammatic pairs
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        // Use two pointers to traverse the string from both ends
        int left = 0;
        int right = n.length() - 1;
        // Continue until the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Check if the characters at the current positions are valid Strobogrammatic pairs
            if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right))) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }
        // If the loop completes, the string is Strobogrammatic
        return true;
    }
}
