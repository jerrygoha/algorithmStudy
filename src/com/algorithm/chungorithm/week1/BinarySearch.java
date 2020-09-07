package com.algorithm.chungorithm.week1;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int arr[], int x) {
        int n = arr.length;
        int key = x;
        int[] array = arr;
        int rt = 0;
        for(int i = 0; i<n; i++){
            if(array[i]==key){
                rt = i;
                break;
            }
            rt = -1;
        }

        return rt;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int key = Integer.parseInt(in.nextLine());
        String[] s = in.nextLine().split("\\s+");

        int n = s.length;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(s[i]);
        }
        int result = binarySearch(data, key);

        System.out.println(result);

        in.close();
    }
}
