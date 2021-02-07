package com.algorithmStudy.acmicpc;

import java.io.*;

public class Main11654 {
    public static void main(String[] args) throws IOException {
        new solve11654().problem();

    }
}

class solve11654{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char a = br.readLine().charAt(0);
        int result = getAsc(a);
        bw.write(""+result);
        bw.flush();
        bw.close();
    }

    int getAsc(char a){
        char Asc = a;
        int getN = (int)Asc;
        return getN;
    }
}