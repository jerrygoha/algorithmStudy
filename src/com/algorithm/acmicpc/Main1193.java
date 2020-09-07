package com.algorithm.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1193번 - 혼자 힘으로 로직 이해가 안되어서 구글링 해봤었음. 여유있을때 다시 풀어보자.


public class Main1193 {
    public static void main(String[] args) throws IOException {
        new solve1193().problem();
    }
}
class solve1193{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int numberArr = 0;
        int[] numerator = new int[10000000];
        int[] denominator = new int[10000000];
        int sum = 0;

        for(int i = 0; i<numerator.length; i++){
            sum += i+1;
            if(i == 0){
                numerator[i]=1;
                denominator[i]=1;
            }else if(i%2 == 1){
                //for(sum+1<);
            }
        }



    }
}
