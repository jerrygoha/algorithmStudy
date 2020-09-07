package com.algorithm.chungorithm.week1;

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
        long[] fibo = new long[(int) input+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i = 2; i<=(int)input; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[(int) input];
    }

}
