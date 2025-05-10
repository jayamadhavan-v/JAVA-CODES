package com.DSA_Concepts;
public class insertPos {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        ///int a=insertionPos( int[] target);
        int [] outputArray = new int[arr.length+1];
        inserttarget(arr,outputArray,target);
    }

    static void inserttarget(int[] arr,int [] outputArray,int target) {
        int len = arr.length+1;
        int i=0;
        while(i<len) {
            if(arr[i] > target && arr[i] <target){
                outputArray[i]=target;
            }
            else{
                outputArray[i]=arr[i];
            }
            i++;
        }
    }
}
    /*
    public static int insertionPos(int[] nums, int target){
        int i, len= nums.length;int  count=0;
        if(target < len){
            for(i=0;i<len;i++) {
                if (nums[i] < target) {
                    System.out.println(count);
                    count++;
                } else {
                    break;
                }
            }
        }else{
            return len+1;
        }
    }
}

     */
