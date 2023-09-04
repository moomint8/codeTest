package backjoon.stepByStepLearning.chapter9_FactorMultiplePrimenumber;

/*
약수들의 합

문제
어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

입력
입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)

입력의 마지막엔 -1이 주어진다.

출력
테스트케이스 마다 한줄에 하나씩 출력해야 한다.

n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).

이때, 약수들은 오름차순으로 나열해야 한다.

n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
 */

import java.io.*;

public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(reader.readLine());

            if (num == -1) {
                break;
            } else if (num == 1) {
                writer.write(num + " is NOT perfect.\n");
            } else {
                int sum = 1;

                writer.write(num + " = " + 1 + "");

                for (int i = 2; i < (num / 2) + 1; i++) {
                    if (num % i == 0) {
                        writer.write(" + " + i);
                        sum += i;
                    }
                }

                if (num == sum) {
                    writer.write("\n");
                } else {
                    writer = new BufferedWriter(new OutputStreamWriter(System.out));
                    writer.write(num + " is NOT perfect.\n");
                }
            }

            writer.flush();
        }

        writer.close();
    }
}
