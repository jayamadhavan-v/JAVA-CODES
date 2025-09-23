package com.skillrack;
import java.util.*;
public class InvalidNumber {

    public static void main(String[] args) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);

            ArrayList<String> list = new ArrayList<>();

            while(true){
                String input = sc.nextLine();
                if(input.equals("q") || input.equals("Q")){
                    break;
                }
                list.add(input);
            }

            int cnt = 0;
            for(int i = 0; i < list.size(); i++){
                if(!isNumber(list.get(i)) || list.get(i).length() > 10){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        public static boolean isNumber(String str){
            return str.matches("-?\\d+(\\.\\d+)?");
        }
}



