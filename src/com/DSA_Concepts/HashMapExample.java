package com.DSA_Concepts;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(5, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Retrieving a value
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating over a HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Checking if a key or value exists
        System.out.println("Contains key 30? " + map.containsKey(30));
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // Removing an entry
        map.remove(1);
        System.out.println("Map after removal: " + map);
    }
}
