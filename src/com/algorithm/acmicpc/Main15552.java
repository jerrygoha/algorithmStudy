package com.algorithm.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main15552 {

    public static void main(String[] args) throws IOException {
        new p15552().solve();
    }
}

class p15552{
    public void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testTime = Integer.parseInt(bf.readLine());
        int a1, b1;
        for(int i = 0; i<testTime; i++){
            st = new StringTokenizer(bf.readLine());
            a1 = Integer.parseInt(st.nextToken());
            b1 = Integer.parseInt(st.nextToken());
            bw.write(a1 + b1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
