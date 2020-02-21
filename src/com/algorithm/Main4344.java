package com.algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4344 {
    public static void main(String[] args) throws IOException {
        new solve4344().problem();
    }
}
class solve4344{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int caseCount = Integer.parseInt(br.readLine());
        double studentCount;
        double[] studentScore = new double[1000];
        double sum = 0;
        double avg = 0;
        double overScore = 0;

        for(int i = 0; i<caseCount; i++){
            st = new StringTokenizer(br.readLine(), " ");
            studentCount = Integer.parseInt(st.nextToken());
            for(int j = 0; j<studentCount; j++){
                studentScore[j] = Double.parseDouble(st.nextToken());
                sum += studentScore[j];
            }
            avg = sum/studentCount;
            for(int k = 0; k<studentCount; k++){
                if(studentScore[k]>avg){
                    overScore++;
                }
            }

            bw.write(String.format("%.3f", overScore/studentCount*100)+"%\n");

            Arrays.fill(studentScore,0);
            sum = 0;
            overScore = 0;
        }
        bw.flush();
        bw.close();

    }

}