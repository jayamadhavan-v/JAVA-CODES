package chatgpt_problems;


import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Character_Frequency_Counter {
    public static void main(String[] args) {
        System.out.print("Enter s string : ");

        String input = new Scanner(System.in).next().trim();

        frequencyCounter(input.toLowerCase());
    }

    private static void frequencyCounter(String input) {
        TreeMap<Character,Integer> myMap = new TreeMap<>();


        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if(a != ' ') {
                myMap.put(a, myMap.getOrDefault(a, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
