package com.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main2577 {
    public static void main(String[] args) throws IOException {
        new solve2577().problem();
    }
}

class solve2577{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b, c;
        String result;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        result = Integer.toString(a*b*c);
        String[] resultrow = new String[result.length()];


        int count0 =0, count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9 = 0;
        for(int i = 0; i<result.length(); i++){
            resultrow[i] = Character.toString(result.charAt(i));

            switch (resultrow[i]){
                case "0" : count0++; break;
                case "1" : count1++; break;
                case "2" : count2++; break;
                case "3" : count3++; break;
                case "4" : count4++; break;
                case "5" : count5++; break;
                case "6" : count6++; break;
                case "7" : count7++; break;
                case "8" : count8++; break;
                case "9" : count9++; break;
                default: bw.write("invalid"+i); break;

            }

        }
        bw.write(""+count0+"\n");
        bw.write(""+count1+"\n");
        bw.write(""+count2+"\n");
        bw.write(""+count3+"\n");
        bw.write(""+count4+"\n");
        bw.write(""+count5+"\n");
        bw.write(""+count6+"\n");
        bw.write(""+count7+"\n");
        bw.write(""+count8+"\n");
        bw.write(""+count9);
        bw.flush();
        bw.close();

    }
}