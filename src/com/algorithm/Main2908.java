package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main2908 {
    public static void main(String[] args) throws IOException {
        new solve2908().problem();
    }
}

class solve2908{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = changeInput(Integer.parseInt(st.nextToken()));
        int second = changeInput(Integer.parseInt(st.nextToken()));

        if(first>second){
            bw.write(""+first);
        }else{
            bw.write(""+second);
        }
        bw.flush();
        bw.close();


    }

    int changeInput(int a){
        int input = a;

        int hun = input/100;
        int ten = (input-(hun*100))/10;
        int one = (input-(hun*100))%10;

        return (one*100)+(ten*10)+hun;

    }
}
