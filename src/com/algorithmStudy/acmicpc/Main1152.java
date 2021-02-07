package com.algorithmStudy.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main1152 {
    public static void main(String[] args) throws IOException {
        new solve1152().problem();
    }
}

class solve1152{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write("" + st.countTokens());
        bw.flush();
        bw.close();


    }
}
