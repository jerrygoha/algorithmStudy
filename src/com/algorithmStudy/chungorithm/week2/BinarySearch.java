package com.algorithmStudy.chungorithm.week2;

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
        int result = binarySearch(data, key, 0, data.length-1);

        System.out.println(result);

        in.close();
    }

    static int binarySearch(int arr[], int x, int start, int end) {
        int upperBound = end;
        int lowerBound = start;
        int median;

        while(true){
            if(upperBound<lowerBound){
                return -1;
            }
            median = (upperBound+lowerBound)/2;

            if(arr[median]==x){
                return median;
            }else if(arr[median]>x){
                binarySearch(arr, x, lowerBound, median-1);
            }else{
                binarySearch(arr, x, median+1, upperBound);
            }
        }

    }

}
