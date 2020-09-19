package com.algorithm.chungorithm.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FibonacciRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputInt = Integer.parseInt(br.readLine());

        long result = recursionFibo((int) inputInt);
        System.out.println(result);
        br.close();

    }

    static long recursionFibo(int input){
        if(input<2){                    //기저사례 #1.
            return input;
        }else{
            long[] cache = new long[input+1];
            Arrays.fill(cache, -1);
            cache[0] = 0;
            cache[1] = 1;
            if(cache[input] != -1){     //기저사례 #2.
                return cache[input];
            }else{                      //기저사례 충족 못할 시 값을 실제로 구함
                cache[input] = recursionFibo(input-1) + recursionFibo(input-2);
                return cache[input];
            }
        }
    }




}
