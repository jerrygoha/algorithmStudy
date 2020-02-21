package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        new solve10818().problem();
    }
}

class solve10818{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] num = new int[count];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;

        for(int i = 0; i<count; i++){
            num[i] = Integer.parseInt(st.nextToken());
            if(max<num[i]){
                max = num[i];
            }else if(min>num[i]){
                min = num[i];
            }
        }

        bw.write("" + min +" " + max);
        bw.flush();
        bw.close();
    }
}