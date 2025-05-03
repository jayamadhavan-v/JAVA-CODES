package com.DSA;
public class LuckyNumber {
    public static void main(String[] args) {
        int lowerBound = 410;
        int upperBound = 450;
        int unLuckyNumber = 3;
        //luckman(lowerBound,upperBound,unLuckyNumber);
        int i, copyOfLast, copyOfi, copyOfBefore;
        for (i = lowerBound; i < upperBound; i++) {
            boolean isLucky = false;
            copyOfi = i;
            int last = copyOfi% 10;
//            if (last == unLuckyNumber){
//                isLucky = false;
//                //break;
//            }
            //copyOfLast = last;
            copyOfi /= 10;
            int beforeLast = copyOfi% 10;
//            if (beforeLast == unLuckyNumber) {
//                isLucky = false;
//                //break;
//            }
           // copyOfBefore = beforeLast;
            copyOfi/= 10;
            if (beforeLast > last && copyOfi > beforeLast + last  && beforeLast != unLuckyNumber && last != unLuckyNumber) {
                isLucky = true;

            }

            if (isLucky) {
                System.out.print(i + "_");
            }
        }
    }
/*
    static void luckman(int lowerBound, int upperBound, int unLuckyNumber) {
        if(lowerBound==upperBound){
            return;
        }
        else if(lowerBound<upperBound){
            for(int i=lowerBound;i<upperBound;i++){
                int copy= i;
                int last = copy%10;
                copy/=10;
                while(copy>9 && last != unLuckyNumber){
                    int beforelast = copy%10;

                }
            }
        }
        for(int i=lowerBound;i<upperBound;i++){
         //   if(){

            }
        }

 */
}


