package backjoon.stepByStepLearning.chapter5_String;

/*
문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
 */

import java.io.*;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numLength = Integer.parseInt(bufferedReader.readLine());
        String number = bufferedReader.readLine();
        int sum = 0;

        for (int i = 0; i < numLength; i++) {
            sum += number.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
