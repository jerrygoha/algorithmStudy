package com.algorithm.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {
    public static void main(String[] args) throws IOException {
        new solve2292().problem();
    }
}
class solve2292{
    public void problem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cnt = 0;
        int lastRoomNum = 1;
        int firstRoomNum;
        while(true){
            if(input == 1){
                System.out.println("1");
                break;
            }

            firstRoomNum = lastRoomNum+1;
            lastRoomNum += cnt*6;
            if(input>=firstRoomNum && input<=lastRoomNum) {

                System.out.println(cnt + 1);
                break;
            }else {
                cnt++;
            }
        }
    }
}
