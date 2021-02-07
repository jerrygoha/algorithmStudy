package com.algorithmStudy.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        new solve1546().problem();
    }
}

class solve1546{
    public void problem() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int subCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        double[] subRow = new double[subCount];
        double[] newSubRow = new double[subCount];

        double max = 0;
        double sum = 0;


        for(int i = 0; i<subCount; i++){
            subRow[i] = Integer.parseInt(st.nextToken());
            if(max<subRow[i]){
                max = subRow[i];
            }
        }

        for(int j = 0; j<subCount; j++){
            newSubRow[j] = (subRow[j]/max)*100;
            sum += newSubRow[j];
        }



        bw.write(String.format("%.2f", sum/subCount));
        bw.flush();
        bw.close();








    }
}
