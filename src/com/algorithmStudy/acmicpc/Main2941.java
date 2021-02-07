package com.algorithmStudy.acmicpc;

import java.io.*;

public class Main2941 {
    public static void main(String[] args) throws IOException {
        new solve2941().problem();
    }
}
class solve2941{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String charInput;
        int cntApb = 0;
        for(int i = 0; i<input.length(); i++){
            charInput = Character.toString(input.charAt(i));
            if(i==0){
                cntApb++;
                continue;
            }
            else if(i>0) {
                String s1 = Character.toString(input.charAt(i - 1));
                if(charInput.equals("z")){
                    String s = s1;

                    if(s.equals("d") && i != input.length()-1){
                        if((Character.toString(input.charAt(i + 1))).equals("=")){
                            continue;
                        }else{
                            cntApb++;
                        }
                    }else{
                        cntApb++;
                    }
                }else if(charInput.equals("j")){
                    String j = s1;
                    if(j.equals("n") || j.equals("l")){

                        continue;
                    }else{
                        cntApb++;
                    }

                }else if(charInput.equals("=")){
                    if(i == input.length()-1){
                        break;
                    }
                    continue;
                }else if(charInput.equals("-")){
                    if(i == input.length()-1){
                        break;
                    }

                    continue;
                }else{
                    cntApb++;
                }

            }

        }
        bw.write(""+cntApb);
        bw.flush();
        bw.close();

    }
}