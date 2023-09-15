package backjoon.stepByStepLearning.chapter12_BruteForce;

/*
분해합

문제
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의
생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가
없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */

import java.io.*;

public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = {0, 0, 0, 0, 0, 0, 1};
        int sum = 0;

        int mul = 1;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j <= 6; j++) {
                sum += testcase[6 - j] * mul + testcase[6 - j];
                mul *= 10;
            }
            mul = 1;

            if (sum == num) {
                sum = 0;
                for (int j = 0; j <= 6; j++) {
                    sum += testcase[6 - j] * mul;
                    mul *= 10;
                }
                break;
            } else {
                testcase[6]++;
                for (int j = 6; j > 0; j--) {
                    if (testcase[j] == 10) {
                        testcase[j] = 0;
                        testcase[j - 1]++;
                    }
                }
                sum = 0;
            }
        }


        for (int i = 0; i <= 6; i++) {
            writer.write(testcase[i] + "");
        }
        writer.write("\n" + sum + "");

        writer.flush();
        writer.close();
    }
}
