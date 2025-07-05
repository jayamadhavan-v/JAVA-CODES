package com.TRAINING_SESSION_QUESTION;


public class candy {
    public static void main(String[] args) {
        int[] arr =// {1,0,2};
//                {1,2,2};
                {1,3,2,2,1};
        getCandy(arr);
    }
    static void getCandy(int[] arr){
        int sum = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                sum += 1;
            }

        }
        for (int j = arr.length-1; j >0 ; j--) {
              if(arr[j]<arr[j-1]){
                  sum+=1;
              }
        }
        System.out.println(sum);
    }



}
