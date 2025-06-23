package com.skillrack;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;
public class Local_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime time = LocalTime.of(22,04,6);
        System.out.println(time);

        LocalTime times = LocalTime.parse("10:15");
        System.out.println(times);
    }
}
