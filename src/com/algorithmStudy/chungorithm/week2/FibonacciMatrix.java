package com.algorithmStudy.chungorithm.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long inputInt = Integer.parseInt(br.readLine())-1;


        long result = matrixFibo((int) inputInt);
        System.out.println(result);
        br.close();

    }

    static long matrixFibo(int input) {
        int k = 0;
        long[][] matrix = {{1, 0}, {0, 1}};   //행렬의 항등원
        long[][] ansMatrix = {{1, 1}, {1, 0}};   //곱셈을 시작해 나갈 기본 행렬
        long[][] result = ansMatrix;

        if(input<2){
            return input+1;
        }else{
            while(k<input){
                result = matrixMultiply(result, ansMatrix);
                k++;
            }
            return result[0][1];
        }

    }

    static long[][] matrixMultiply(long[][] matrix1, long[][] matrix2){
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        long[][] temp = new long[m1][n2];

        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                for(int k=0; k<n1; k++){
                    temp[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return temp;
    }

}
