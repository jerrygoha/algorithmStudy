package com.algorithmStudy.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main10871 {
    public static void main(String[] args) throws IOException {
        new solve10871().problem();
    }
}
class solve10871{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1, st2;
        st1 = new StringTokenizer(br.readLine());
        int numberOf = Integer.parseInt(st1.nextToken());
        int numberX = Integer.parseInt(st1.nextToken());
        int[] saveNum = new int[numberOf];
        st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<numberOf; i++){

            saveNum[i] = Integer.parseInt(st2.nextToken());
            if(saveNum[i]<numberX){
                bw.write(saveNum[i] + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
