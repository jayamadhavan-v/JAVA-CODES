package com.skillrack;
import java.util.*;
public class Minimum_Sum_M_out_N{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total numbers (n)
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input the n numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input m
        System.out.print("Enter m (how many minimum elements to sum): ");
        int m = sc.nextInt();

        // Sort the array
        Arrays.sort(arr);

        // Sum the first m elements
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        System.out.println("Minimum sum of " + m + " numbers is: " + sum);
    }
}
