package com.DSA;

public class PowerOfTheNumber {
    public static void main(String[] args) {
            Mains1 sc = new Mains1();
            double res = sc.power(2,10);
            System.out.println(res);

//        com.DSA.powerConcepts pows = new com.DSA.powerConcepts();
//        double myPow = pows.myPowMethod(2,10);
//        System.out.println(myPow);
    }
}
class powerConcepts {
    public double myPowMethod(double base,int pow ) {
        double ans = 1;
        long cPow = 1 * pow;
        while(cPow> 0 ) {
            if( cPow % 2 == 1) {
                ans *= base;
                cPow--;
            } else {
                base *= base;
                cPow /=2;
            }
        }
        if( pow<0) {
            ans =  (double)(1.0) / (double)(ans);
        }
        return ans;
    }
}
class Mains1 {

    // Recursive function to calculate pow(b, e)
    public  double power(double b, int e) {

        // Base Case: pow(b, 0) = 1
        if (e == 0)
            return 1;

        if (e < 0)
            return 1 / power(b, -e);

        double temp = power(b, e / 2);

        if (e % 2 == 0)
            return temp * temp;
        else
            return b * temp * temp;
    }
}
