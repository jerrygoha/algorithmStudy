package com.algorithm.acmicpc;

import java.io.*;

public class Main2562 {
    public static void main(String[] args) throws IOException {
        new solve2562().problem();
    }
}

class solve2562{
    public void problem() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] save = new int[9];
        int max = 0, count = 0;

        for(int i  = 0; i<9; i++){
            save[i] = Integer.parseInt(br.readLine());
            if(max<save[i]){
                max = save[i];
                count = i+1;
            }
        }

        bw.write(""+max+"\n");
        bw.write(""+count);
        bw.flush();
        bw.close();
    }
}
