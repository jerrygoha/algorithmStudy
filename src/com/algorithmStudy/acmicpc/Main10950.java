package com.algorithmStudy.acmicpc;

import java.util.Scanner;

public class Main10950 {

    public static void main(String[] args){

        int testTime, a1, b1;

        Scanner input = new Scanner(System.in);

        testTime = input.nextInt();

        for(int i = 0; i<testTime; i++){
            a1 = input.nextInt();
            b1 = input.nextInt();
            System.out.println(a1+b1);
        }

    }
}
