package com.algorithm.chungorithm.week1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int key = Integer.parseInt(in.nextLine());
        String[] s = in.nextLine().split("\\s+");

        int n = s.length;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(data);
        int result = binarySearch(data, key);

        System.out.println(result);

        in.close();
    }

    static int binarySearch(int arr[], int x) {
        int arrSize = arr.length;
        int upperBound = arrSize-1;
        int lowerBound = 0;
        int median;

        while(true){
            if(upperBound<lowerBound){
                return -1;
            }
            median = (upperBound+lowerBound)/2;

            if(arr[median]==x){
                return median;
            }else if(arr[median]>x){
                upperBound = median-1;
            }else{
                lowerBound = median+1;
            }
        }

    }

}
