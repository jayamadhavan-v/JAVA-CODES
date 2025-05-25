package com.DSA_Concepts;
import java.util.Arrays;

public class SortingMethods {
    public static void main(String[] args) {
//        int[] arr1 ={98,-10,1,4,5,2,3,6};
   //    int[] arr =/*{4,2,1,0};//*/{5,4,3,2,1};
       int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(Arrays.toString(arr));
        bubble( arr);
        selectionSortByLongestElement( arr);
        selectionSortByMinElement(arr);
        insertionSort(arr);
        insertionSort2(arr);
          cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        findMissingNo(arr);

    }

    static void findMissingNo(int[] arr) {
        int len = arr.length;
        int [] missingNoArray = new int[5];
        int i=0;
        for (int index = 0; index < len; index++){  //arr = {1, 2, 3, 4, 3, 2, 7, 8} j= 0 to end "7"end = len-1 : 8-1 =7
            if(arr[index] != index+1){              //index =j+1 => 0 +1 --> 1 ; so arr[j]--> 1 === index -->1
                missingNoArray[i] = arr[index];          //both index and arr[j] will be so we can find the missing number
                i++;                                //
            }
        }

        System.out.println(Arrays.toString(missingNoArray));
    }

    static void cyclicSort(int[] arr) {
        int len = arr.length ,i=0;
        while(i<len){
            int correct = arr[i]-1;

            /*in case len is 5 and array will be{ 5,4,3,2,1} we cant sort this i 0 to  4 only
            ,arr[0] = 5 but index value to upto 4 for avoid tht error we use arr[i]<len
             5<5 false;
             */
            /*arr[i]<=len &&*/

            if(arr[i] != arr[correct] ){
                swapMethod(arr,i,correct);
              // System.out.println(Arrays.toString(arr));
            }
            else{
                i++;
            }
        }
    }

    static void insertionSort2(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int j=i+1;
            while(j>0 && arr[j-1] >arr[j]){
                swapMethod(arr,j-1,j);
                j--;
            }
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1]>arr[j]){
                    swapMethod(arr,j-1,j);
                }
                else{
                    break;
                }
            }

        }
    }


    static void selectionSortByMinElement(int[] arr) {
        int len=arr.length,i,j;
        for( i=0;i<len-1;i++) {
            int minimum = i;
            boolean areSorted= false;
            for (j = i; j<len; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                    areSorted = true;
                }
                //int minimum = getMinIndex(arr, i, len);

            }
            if(areSorted) {
                swapMethod(arr, minimum, i);
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    static void selectionSortByLongestElement(int[] arr) {
        int len=arr.length;
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxItem(arr,0,last);
            swapMethod(arr,maxIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void swapMethod(int[] arr,int first, int second) {
            int temp = arr[first];
            arr[first]= arr[second];
            arr[second]=temp;

    }

    public static int getMaxItem(int[] arr,int start,int end) {
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
    }

    public static int getMinIndex(int[] arr,int start,int end){
        int min =start;
        for(int i=start;i<end;i++){
          if(arr[min]>arr[i]){
              min=i;
          }
        }
       return min;
    }

    public static void bubble(int [] arr){
        int temp,i,j;
        boolean swap;
        int len = arr.length;
        for(i=0;i<len-1;i++){
            swap=false;
            for(j=1;j<len-i;j++){
                if(arr[j] < arr[j-1]){
                    swapMethod(arr,j,j-1);
                    swap=true;
                }
            }
            if(!swap){
                break;
           }
        }
        System.out.println(Arrays.toString(arr));
    }

}
