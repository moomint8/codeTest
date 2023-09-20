package backjoon.stepByStepLearning.chapter13_Sort;

/*
수 정렬하기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	183988	104803	72194	57.911%
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

import java.io.*;

public class SortNumber01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = new int[num];

        for (int i = 0; i < num; i++) {
            testcase[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (testcase[j] > testcase[j + 1]) {
                    int temp = testcase[j];
                    testcase[j] = testcase[j + 1];
                    testcase[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            writer.write(testcase[i] + "\n");
        }

        writer.flush();
        writer.close();
    }
}
