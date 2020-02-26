package com.algorithm;

import java.io.*;

public class Main1152 {
    public static void main(String[] args) throws IOException {
        new solve1152().problem();
    }
}

class solve1152{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] inputDecompotion = input.split(" ");
        int cnt = inputDecompotion.length;
        if(inputDecompotion[0].equals("") && cnt>0){
            cnt--;
        }

        bw.write(""+cnt);
        bw.flush();
        bw.close();
    }
}
