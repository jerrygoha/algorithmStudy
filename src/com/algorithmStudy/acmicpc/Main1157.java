package com.algorithmStudy.acmicpc;

import java.io.*;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        new solve1157().problem();

    }
}

class solve1157{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputText = br.readLine();
        String[] alpha = inputText.split("");
        int[] cnt = new int[26];
        //a0,b1,c2,d3,e4,f5,g6,h7,i8,j9,k10,l11,m12,n13,o14,p15,q16,r17,s18,t19,u20,v21,w22,x23,y24,z25

        for(String alp : alpha){

            if(alp.equalsIgnoreCase("a")){
                cnt[0]++;
            }else if(alp.equalsIgnoreCase("b")){
                cnt[1]++;
            }else if(alp.equalsIgnoreCase("c")){
                cnt[2]++;
            }else if(alp.equalsIgnoreCase("d")){
                cnt[3]++;
            }else if(alp.equalsIgnoreCase("e")){
                cnt[4]++;
            }else if(alp.equalsIgnoreCase("f")){
                cnt[5]++;
            }else if(alp.equalsIgnoreCase("g")){
                cnt[6]++;
            }else if(alp.equalsIgnoreCase("h")){
                cnt[7]++;
            }else if(alp.equalsIgnoreCase("i")){
                cnt[8]++;
            }else if(alp.equalsIgnoreCase("j")){
                cnt[9]++;
            }else if(alp.equalsIgnoreCase("k")){
                cnt[10]++;
            }else if(alp.equalsIgnoreCase("l")){
                cnt[11]++;
            }else if(alp.equalsIgnoreCase("m")){
                cnt[12]++;
            }else if(alp.equalsIgnoreCase("n")){
                cnt[13]++;
            }else if(alp.equalsIgnoreCase("o")){
                cnt[14]++;
            }else if(alp.equalsIgnoreCase("p")){
                cnt[15]++;
            }else if(alp.equalsIgnoreCase("q")){
                cnt[16]++;
            }else if(alp.equalsIgnoreCase("r")){
                cnt[17]++;
            }else if(alp.equalsIgnoreCase("s")){
                cnt[18]++;
            }else if(alp.equalsIgnoreCase("t")){
                cnt[19]++;
            }else if(alp.equalsIgnoreCase("u")){
                cnt[20]++;
            }else if(alp.equalsIgnoreCase("v")){
                cnt[21]++;
            }else if(alp.equalsIgnoreCase("w")){
                cnt[22]++;
            }else if(alp.equalsIgnoreCase("x")){
                cnt[23]++;
            }else if(alp.equalsIgnoreCase("y")){
                cnt[24]++;
            }else if(alp.equalsIgnoreCase("z")){
                cnt[25]++;
            }

        }

        int max = 0;
        int maxCnt = 0;
        for(int i = 0; i<cnt.length; i++){
            if(max<cnt[i]){
                max = cnt[i];
                maxCnt = i;
            }
        }
        int count = 0;
        for(int j = 0; j<cnt.length; j++){
            if(max==cnt[j]){
                count++;
                if(count ==2){
                    bw.write("?");
                    break;
                }
            }
        }

        String[] alpb = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        if(count == 1){
            bw.write(alpb[maxCnt]);
        }

        bw.flush();
        bw.close();



    }
}
