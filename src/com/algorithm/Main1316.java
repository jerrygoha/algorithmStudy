package com.algorithm;

import java.io.*;

//boolean 타입 배열 이용해보는거 어떨까..?
public class Main1316 {
    public static void main(String[] args) throws IOException {
        new solve1316().problem();
    }
}
class solve1316{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfword = Integer.parseInt(br.readLine());
        boolean test;
        int wordCnt = 0;
        for(int i = 0; i<numberOfword; i++){
            test = yesOrno(br.readLine());
            if(test){
                wordCnt++;
            }
        }
        bw.write(""+wordCnt);
        bw.flush();
        bw.close();
    }

    boolean yesOrno(String a){
        boolean result = true;
        String input = a;
        boolean[] alpTest = new boolean[26];
        String alpEach;
        String alpEachPast;
        for(int i = 0; i<input.length(); i++){
            alpEach = Character.toString(input.charAt(i));
            switch (alpEach){
                case "a" :
                    if(i==0){
                        alpTest[0] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[0]){
                                result = false;
                                break;
                            }else{
                                alpTest[0] = true;
                                break;
                            }
                        }

                    }case "b" :
                    if(i==0){
                        alpTest[1] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[1]){
                                result = false;
                                break;
                            }else{
                                alpTest[1] = true;
                                break;
                            }
                        }

                    }case "c" :
                    if(i==0){
                        alpTest[2] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[2]){
                                result = false;
                                break;
                            }else{
                                alpTest[2] = true;
                                break;
                            }
                        }

                    }case "d" :
                    if(i==0){
                        alpTest[3] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[3]){
                                result = false;
                                break;
                            }else{
                                alpTest[3] = true;
                                break;
                            }
                        }

                    }case "e" :
                    if(i==0){
                        alpTest[4] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[4]){
                                result = false;
                                break;
                            }else{
                                alpTest[4] = true;
                                break;
                            }
                        }

                    }case "f" :
                    if(i==0){
                        alpTest[5] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[5]){
                                result = false;
                                break;
                            }else{
                                alpTest[5] = true;
                                break;
                            }
                        }

                    }case "g" :
                    if(i==0){
                        alpTest[6] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[6]){
                                result = false;
                                break;
                            }else{
                                alpTest[6] = true;
                                break;
                            }
                        }

                    }case "h" :
                    if(i==0){
                        alpTest[7] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[7]){
                                result = false;
                                break;
                            }else{
                                alpTest[7] = true;
                                break;
                            }
                        }

                    }case "i" :
                    if(i==0){
                        alpTest[8] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[8]){
                                result = false;
                                break;
                            }else{
                                alpTest[8] = true;
                                break;
                            }
                        }

                    }case "j" :
                    if(i==0){
                        alpTest[9] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[9]){
                                result = false;
                                break;
                            }else{
                                alpTest[9] = true;
                                break;
                            }
                        }

                    }case "k" :
                    if(i==0){
                        alpTest[10] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[10]){
                                result = false;
                                break;
                            }else{
                                alpTest[10] = true;
                                break;
                            }
                        }

                    }case "l" :
                    if(i==0){
                        alpTest[11] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[11]){
                                result = false;
                                break;
                            }else{
                                alpTest[11] = true;
                                break;
                            }
                        }

                    }case "m" :
                    if(i==0){
                        alpTest[12] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[12]){
                                result = false;
                                break;
                            }else{
                                alpTest[12] = true;
                                break;
                            }
                        }

                    }case "n" :
                    if(i==0){
                        alpTest[13] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[13]){
                                result = false;
                                break;
                            }else{
                                alpTest[13] = true;
                                break;
                            }
                        }

                    }case "o" :
                    if(i==0){
                        alpTest[14] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[14]){
                                result = false;
                                break;
                            }else{
                                alpTest[14] = true;
                                break;
                            }
                        }

                    }case "p" :
                    if(i==0){
                        alpTest[15] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[15]){
                                result = false;
                                break;
                            }else{
                                alpTest[15] = true;
                                break;
                            }
                        }

                    }case "q" :
                    if(i==0){
                        alpTest[16] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[16]){
                                result = false;
                                break;
                            }else{
                                alpTest[16] = true;
                                break;
                            }
                        }

                    }case "r" :
                    if(i==0){
                        alpTest[17] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[17]){
                                result = false;
                                break;
                            }else{
                                alpTest[17] = true;
                                break;
                            }
                        }

                    }case "s" :
                    if(i==0){
                        alpTest[18] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[18]){
                                result = false;
                                break;
                            }else{
                                alpTest[18] = true;
                                break;
                            }
                        }

                    }case "t" :
                    if(i==0){
                        alpTest[19] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[19]){
                                result = false;
                                break;
                            }else{
                                alpTest[19] = true;
                                break;
                            }
                        }

                    }case "u" :
                    if(i==0){
                        alpTest[20] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[20]){
                                result = false;
                                break;
                            }else{
                                alpTest[20] = true;
                                break;
                            }
                        }

                    }case "v" :
                    if(i==0){
                        alpTest[21] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[21]){
                                result = false;
                                break;
                            }else{
                                alpTest[21] = true;
                                break;
                            }
                        }

                    }case "w" :
                    if(i==0){
                        alpTest[22] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[22]){
                                result = false;
                                break;
                            }else{
                                alpTest[22] = true;
                                break;
                            }
                        }

                    }case "x" :
                    if(i==0){
                        alpTest[23] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[23]){
                                result = false;
                                break;
                            }else{
                                alpTest[23] = true;
                                break;
                            }
                        }

                    }case "y" :
                    if(i==0){
                        alpTest[24] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[24]){
                                result = false;
                                break;
                            }else{
                                alpTest[24] = true;
                                break;
                            }
                        }

                    }case "z" :
                    if(i==0){
                        alpTest[25] = true;
                        break;
                    }else{
                        alpEachPast = Character.toString(input.charAt(i-1));
                        if(alpEach.equals(alpEachPast)){
                            break;
                        }else {
                            if(alpTest[25]){
                                result = false;
                                break;
                            }else{
                                alpTest[25] = true;
                                break;
                            }
                        }

                    }
            }
        }

        return result;
    }
}
