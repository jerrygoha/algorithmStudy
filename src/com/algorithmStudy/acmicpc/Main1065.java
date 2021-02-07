package com.algorithmStudy.acmicpc;

import java.io.*;

public class Main1065 {
    public static void main(String[] args) throws IOException {
        new solve1065().problem();
    }
}

class solve1065{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());

        boolean jugde = false;
        int count = 0;

        for(int i = 1; i<=start; i++ ){
            jugde = getHan(i);
            if(jugde){
                count++;
            }
        }

        bw.write("" + count);
        bw.flush();
        bw.close();



    }
    boolean getHan(int a){
        boolean isHan = false;
        int han = a;
        int hnd, ten, one;
        if(a<100){
            isHan = true;
        }else{
            hnd = han/100;
            ten = (han-(hnd*100))/10;
            one = han%10;

            if(ten-hnd == one-ten){
                isHan = true;
            }

        }
        return isHan;
    }
}


