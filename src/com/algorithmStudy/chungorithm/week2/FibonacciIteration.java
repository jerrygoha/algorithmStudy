package com.algorithmStudy.chungorithm.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciIteration {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputNum = Integer.parseInt(br.readLine());
        long result = iterationFibo(inputNum);
        System.out.println(result);
        br.close();


    }

    static long iterationFibo(long input){
        if(input<2){
            return input;
        }
        long[] cache = new long[(int) input+1];
        cache[0]=0;
        cache[1]=1;
        for(int i = 2; i<=(int)input; i++){
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[(int) input];
    }

}
