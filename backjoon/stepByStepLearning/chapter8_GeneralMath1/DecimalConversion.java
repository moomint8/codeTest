package backjoon.stepByStepLearning.chapter8_GeneralMath1;

/*
문제
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class DecimalConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        String number = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        int decimalNum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = (int)Math.pow(base, number.length() - 1 - i);
            if (number.charAt(i) < 58) {
                decimalNum += (number.charAt(i) - 48) * digit;
            } else {
                decimalNum += (number.charAt(i) - 55) * digit;
            }
        }

        writer.write(decimalNum + "\n");

        writer.flush();
        writer.close();
    }
}
