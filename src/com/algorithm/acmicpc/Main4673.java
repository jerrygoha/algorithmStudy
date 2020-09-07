package com.algorithm.acmicpc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main4673 {
    public static void main(String[] args) throws IOException {
        new solve4673().problem();
    }
}

        class solve4673 {
            public void problem() throws IOException {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                boolean[] isNotSelfNumber = new boolean[10001];

                for(int i = 1; i<=10000; i++){
                    int dn = getDn(i);
                    if( dn <= 10000){
                        isNotSelfNumber[dn] = true;
                    }
                }
                for(int i = 1; i<isNotSelfNumber.length; i++){
                    if(!isNotSelfNumber[i]){
                        bw.write("" + i +"\n");
                    }
                }

        bw.flush();
        bw.close();


//        int[] nonSelfNumber = new int[10000];
//        int processSelfNum =0 ;
//        int selfNumber = 1;
//        for(int i = 0; i<10000; i++){
//            processSelfNum = new solve4673().sign(selfNumber);
//            System.out.println("다음생성자는 " + processSelfNum);
//            if(processSelfNum>9999){
//                break;
//            }
//            nonSelfNumber[i] = processSelfNum;
//            selfNumber = processSelfNum;
//        }
//
//
//        int check = 1;
//
//        for(int j = 0; j<nonSelfNumber.length; j++ ){
//
//            if(nonSelfNumber[j]==0){
//                break;
//            }
//            while(check<nonSelfNumber[j]){
//                bw.write(""+check+"\n");
//                check++;
//
//            }
//            if(check==nonSelfNumber[j]){
//                check++;
//            }
//
//        }
//
//        bw.flush();
//        bw.close();

    }

    int getDn(int a){
        int dn = a;
        while(a>0){
            dn += a%10;
            a /= 10;
        }
        return dn;


//        int number = 0;
//
//        if(a<10){
//            number = a+(a%10);
//        }else if(10<=a && a<100){
//            number = a+(a%10)+(a/10);
//        }else if(100<=a && a<1000){
//            number = a+(a/100)+(a%10)+((a-((a/100)*100)/10));
//        }else if(1000<=a && a<10000){
//            number = a+(a/1000)+(a%10)+((a-(a/1000)*1000)/100)+((a%100)/10);
//        }else{
//
//        }
//
//        return number;


    }


}

