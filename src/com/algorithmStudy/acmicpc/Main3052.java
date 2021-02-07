package com.algorithmStudy.acmicpc;

import java.io.*;

public class Main3052 {
    public static void main(String[] args) throws IOException {
        new solve3052().problem();
    }
}

class solve3052{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNumber = 10;
        int[] input = new int[inputNumber];
        int count = inputNumber;
            for(int i = 0; i<inputNumber; i++){
                input[i] = (Integer.parseInt(br.readLine()))%42;
                for(int j = 0; j<i; j++){
                    if(input[j] == input[i]){
                        count--;
                        break;
                    }
                }


        }
        bw.write(""+count);
        bw.flush();
        bw.close();

    }
}

