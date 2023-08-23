package backjoon.stepByStepLearning.chapter6_DeepeningPhaseOne;

/*
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.*;

public class DrawingStars {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                bufferedWriter.append(" ");
            }
            for (int j = 0; j < ((i + 1) * 2) - 1; j++) {
                bufferedWriter.append("*");
            }
            bufferedWriter.append("\n");
        }
        for (int i = number - 1; i > 0; i--) {
//            for (int j = 0; j < i + 1; j++) {
//                bufferedWriter.append(" ");
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
            for (int j = 0; j < number - i; j++) {
                bufferedWriter.append(" ");
            }
            for (int j = 0; j < ((i + 1) * 2) - 3; j++) {
                bufferedWriter.append("*");
            }
            bufferedWriter.append("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
