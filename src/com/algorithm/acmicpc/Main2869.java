package com.algorithm.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2869 {
    public static void main(String[] args) throws IOException {
        new solve2869().problem();
    }
}

class solve2869{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int clim = 0;
        int day = 0;

        while(true){
            day++;
            clim += a;

            if(clim<v){
                clim -= b;

            }else{
                System.out.println(day);
                break;
            }
        }



    }
}
