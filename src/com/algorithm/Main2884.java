package com.algorithm;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args){

        int hour, minute, newMinute;

        Scanner input = new Scanner(System.in);

        hour = input.nextInt();
        minute = input.nextInt();

        if(minute-45<0){
            if(hour==0){
                hour=23;
            }else{
                hour -= 1;
            }
            newMinute = 59-(44-minute);
        }else{
            newMinute = minute-45;
        }

        System.out.println(hour+" "+newMinute);

    }
}
