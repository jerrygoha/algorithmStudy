package com.algorithmStudy.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main2675 {
    public static void main(String[] args) throws IOException {
        new solve2675().problem();
    }
}

class solve2675{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        int repeat;
        String chr;
        String chrText;


        for(int i = 0; i<testCase; i++){
            chr = br.readLine();
            st = new StringTokenizer(chr, " ");
            repeat = Integer.parseInt(st.nextToken());
            chrText = st.nextToken();

            texting(chrText, repeat);

        }

        br.close();


    }

    public void texting(String a, int b) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String chrCase = a;
        int repeat = b;
        String[] chrArr = chrCase.split("");
        for(String chring : chrArr){
            for(int i = 0; i<repeat; i++){
                bw.write(chring);

            }
        }
        bw.write("\n");
        bw.flush();

    }
}
