package com.oop;

import java.util.Arrays;

public class ToStringConcepts {
    public static void main(String[] args) {
        SuperHero thor = new SuperHero("thor","thunder");
        System.out.println(thor.name);
        System.out.println(thor.power);

//      it will print the hashcode for the object

        System.out.println(" calling an reference variable "+thor.toString());
        System.out.println(Arrays.toString(new int[] {1,3,3,4,5}));

    }
}
class SuperHero {
    String name;
    String power;
    SuperHero(String name, String power){
        this.name= name;
        this.power = power;
//        without declaring a "this" keyword it will assign it default value only

    }
    @Override
    /* here I had did the override on the toString Method */
    public String toString(){
        return this.name + ","+ this.power ;
    }

}