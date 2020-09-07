package com.algorithm.acmicpc;

import java.io.*;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        new solve10809().problem();
    }
}
class solve10809{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String chr = br.readLine();
        String[] chrIdv = chr.split("");
        int[] loca = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
                    //a0,b1,c2,d3,e4,f5,g6,h7,i8,j9,k10,l11,m12,n13,o14,p15,q16,r17,s18,t19,u20,v21,w22,x23,y24,z25
        for(int i = 0; i<chrIdv.length; i++){
            String str = chrIdv[i];

            switch (str){
                case "a" : if(loca[0]!=-1){break;}loca[0]=i; break;
                case "b" : if(loca[1]!=-1){break;}loca[1]=i; break;
                case "c" : if(loca[2]!=-1){break;}loca[2]=i; break;
                case "d" : if(loca[3]!=-1){break;}loca[3]=i; break;
                case "e" : if(loca[4]!=-1){break;}loca[4]=i; break;
                case "f" : if(loca[5]!=-1){break;}loca[5]=i; break;
                case "g" : if(loca[6]!=-1){break;}loca[6]=i; break;
                case "h" : if(loca[7]!=-1){break;}loca[7]=i; break;
                case "i" : if(loca[8]!=-1){break;}loca[8]=i; break;
                case "j" : if(loca[9]!=-1){break;}loca[9]=i; break;
                case "k" : if(loca[10]!=-1){break;}loca[10]=i; break;
                case "l" : if(loca[11]!=-1){break;}loca[11]=i; break;
                case "m" : if(loca[12]!=-1){break;}loca[12]=i; break;
                case "n" : if(loca[13]!=-1){break;}loca[13]=i; break;
                case "o" : if(loca[14]!=-1){break;}loca[14]=i; break;
                case "p" : if(loca[15]!=-1){break;}loca[15]=i; break;
                case "q" : if(loca[16]!=-1){break;}loca[16]=i; break;
                case "r" : if(loca[17]!=-1){break;}loca[17]=i; break;
                case "s" : if(loca[18]!=-1){break;}loca[18]=i; break;
                case "t" : if(loca[19]!=-1){break;}loca[19]=i; break;
                case "u" : if(loca[20]!=-1){break;}loca[20]=i; break;
                case "v" : if(loca[21]!=-1){break;}loca[21]=i; break;
                case "w" : if(loca[22]!=-1){break;}loca[22]=i; break;
                case "x" : if(loca[23]!=-1){break;}loca[23]=i; break;
                case "y" : if(loca[24]!=-1){break;}loca[24]=i; break;
                case "z" : if(loca[25]!=-1){break;}loca[25]=i; break;

            }
        }

        for(int i : loca){
            bw.write(""+i+" ");
        }
        bw.flush();
        bw.close();





    }
}
