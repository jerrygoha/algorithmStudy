package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main11022 {
    public static void main(String[] args) throws IOException {
        new solve11022().problem();
    }
}

class  solve11022{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        int a1, b1;

        for(int i = 0; i<testCase; i++){
            st= new StringTokenizer(br.readLine());
            a1 = Integer.parseInt(st.nextToken());
            b1 = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+ a1+ "" +
                    " + " + b1 + " = " + (a1+b1)+"\n");
        }
        bw.flush();
        bw.close();



    }
}
