package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main10951 {
    public static void main(String[] args) throws IOException {
        new solve10951().problem();
    }
}

class solve10951{
    public void problem() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input ="";
        boolean test = true;
        int a1, b1;
        while((input = br.readLine()) != null){

                st = new StringTokenizer(input);
                a1 = Integer.parseInt(st.nextToken());
                b1 = Integer.parseInt(st.nextToken());

                bw.write(a1+b1+"\n");
                bw.flush();


        }


    }
}
