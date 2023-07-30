package backjoon.stepByStepLearning.chapter3_repetition;

/*
문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testcase; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
