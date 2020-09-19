package com.algorithm.chungorithm.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer str = new StringTokenizer(input, " ");
        int countTokens = str.countTokens();
        int[] arr = new int[countTokens];

        for(int i = 0; i<countTokens; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int findMax = findMax(arr, countTokens);
        System.out.println(findMax);

    }

    static int findMax(int[] input, int count){
        int[] arr = input;
        Arrays.sort(arr);
        return arr[count-1];
    }
}
