package com.algorithm.acmicpc;

import java.io.*;
import java.util.StringTokenizer;

public class Main1712 {
    public static void main(String[] args) throws IOException {
        new solve1712().problem();
    }
}
class solve1712{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixedPrice = Integer.parseInt(st.nextToken());
        int variablePrice = Integer.parseInt(st.nextToken());
        int salePrice = Integer.parseInt(st.nextToken());


        if(variablePrice>=salePrice){
            System.out.println("-1");
        }else{
            System.out.println((fixedPrice/(salePrice-variablePrice))+1);
        }








    }
}
