package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        new solve1110().problem();
    }
}

class solve1110{
    public void problem() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 0;
        int tmp = input;

            do {
                tmp = ((tmp%10)*10)+((tmp/10+tmp%10)%10);
                count++;
            }while(input !=tmp);

        bw.write(""+count);
        bw.flush();
        bw.close();

    }
}
