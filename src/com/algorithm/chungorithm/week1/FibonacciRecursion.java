package com.algorithm.chungorithm.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciRecursion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputInt = Integer.parseInt(br.readLine());

        long result = recursionFibo(inputInt);
        System.out.println(result);
        br.close();


    }

    static long recursionFibo(long input){
        if(input<=1){
            return input;
        }else{
            return (recursionFibo(input-1) + recursionFibo(input-2));
        }

    }




}
