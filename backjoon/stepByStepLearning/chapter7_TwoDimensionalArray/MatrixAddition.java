package backjoon.stepByStepLearning.chapter7_TwoDimensionalArray;

/*
문제
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MatrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            Arrays.fill(matrix[i], 0);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(bufferedReader.readLine(), " ");
                for (int k = 0; k < col; k++) {
                    matrix[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                bufferedWriter.append(matrix[i][j] + " ");
            }
            bufferedWriter.append("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
