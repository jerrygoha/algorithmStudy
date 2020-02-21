package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main10952 {
    public static void main(String[] args) throws IOException {
        new solve10952().problem();
    }
}

class solve10952{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean test = true;
        StringTokenizer st;
        int a1, b1;
        while(test){

            st = new StringTokenizer(br.readLine());
            a1 = Integer.parseInt(st.nextToken());
            b1 = Integer.parseInt(st.nextToken());
            if(a1 == 0 && b1 == 0){
                test=false;
            }else{
                bw.write(a1+b1+"\n");
            }

        }
        bw.flush();
        bw.close();

    }
}
