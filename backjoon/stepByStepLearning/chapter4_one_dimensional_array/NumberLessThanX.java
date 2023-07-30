package backjoon.stepByStepLearning.chapter4_one_dimensional_array;

/*
문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class NumberLessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int lengthNumber = Integer.parseInt(st.nextToken());
        int goalNumber = Integer.parseInt(st.nextToken());

        String[] inputLine = reader.readLine().split(" ");

        int[] testcase = new int[lengthNumber];

        for (int i = 0; i < lengthNumber; i++) {
            testcase[i] = Integer.parseInt(inputLine[i]);
        }

        for (int i = 0; i < lengthNumber; i++) {
            if(testcase[i] < goalNumber) {
                writer.write(testcase[i] + " ");
            };
        }

        writer.flush();
        writer.close();
    }
}
