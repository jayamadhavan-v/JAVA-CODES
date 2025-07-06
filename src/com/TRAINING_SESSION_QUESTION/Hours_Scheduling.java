package com.TRAINING_SESSION_QUESTION;

import java.util.*;

public class Hours_Scheduling {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        char[] arr = new char[s1.length()];
        for(int i =0 ;i < s1.length();i++){
            arr[i]=s1.charAt(i);
        }
        int time  = Integer.parseInt(String.valueOf(arr[0]));
//        System.out.println(time);
        char schedule = arr[1];
//        System.out.println(schedule);
        getSchedule(time,schedule);
    }
    public static void getSchedule(int time ,int sch){
        if((time < 12 || time > 5 )  && (sch == 'M' || sch == 'm')){
            System.out.println("morning");
        }
        else  if((time > 12 || time < 18 ) && (sch == 'E' || sch == 'e')){
            System.out.println("evening");
        }

    }
}
