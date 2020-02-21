package com.algorithm;

import java.io.*;

public class Main8958 {
    public static void main(String[] args) throws IOException {
        new solve8958().problem();
    }
}

class solve8958{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String[] caseCount = new String[testCase];

                    int score = 0;
                    int addScore = 0;

                    for(int i = 0; i<testCase; i++){
                        caseCount[i] = br.readLine();
                        for(int j = 0; j<caseCount[i].length(); j++){
                            switch (Character.toString(caseCount[i].charAt(j))){
                                case "O" :
                                    score++;
                                    if(0<j){
                                        if(Character.toString(caseCount[i].charAt(j)).equals(Character.toString(caseCount[i].charAt(j-1)))){
                                            addScore++;
                                        }
                                    }
                                    score += addScore;
                                    break;
                                case "X" :
                                    addScore = 0;
                                    break;
                }
            }
            bw.write(""+score+"\n");
            score = 0;
            addScore = 0;
        }


        bw.flush();
        bw.close();






    }






}
