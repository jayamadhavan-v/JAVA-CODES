package com.Basic_Problems;

public class SkillRackProblems {
    public static void main(String[] args) {
        ///int [] array = { 1, 8, 27, 64, 125, 216, 343, 512, 729, 625};

        int [] array ={8,1,10,125,1,64,85,36,100,1000};
        ///int length = oddSubArray(array);
        ///System.out.print(length);

        cubicSubArray(array);
    }
    public static int oddSubArray(int[] array){
        int count=0;
        for(int num : array){
            if(num % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static void cubicSubArray(int[] array){
        int count = 0;
        for(int num : array) {
            double cubeRoot = Math.cbrt(num);
            ///System.out.println(cubeRoot);
            int roundOf = (int) Math.round(cubeRoot);
            ///System.out.println(roundOf);
            if (Math.pow(roundOf, 3) != num) {
                count++;
            }
        }
        System.out.println(count);
        System.out.print(Math.pow(7,3));
    }

}
