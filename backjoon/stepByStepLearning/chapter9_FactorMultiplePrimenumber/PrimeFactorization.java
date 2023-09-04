package backjoon.stepByStepLearning.chapter9_FactorMultiplePrimenumber;

/*
소인수분해

문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 */

import java.io.*;

public class PrimeFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int cnt = 2;

        boolean[] prime = new boolean[num + 1];

        for (int i = 2; i < (int)Math.sqrt(num) + 1; i++) {
            if(prime[i]) { continue; }

            for (int j = i + i; j <= num; j += i) {
                prime[j] = true;
            }
        }

        while (num >= cnt) {
            while (prime[cnt]) {
                cnt++;
            }
            if (num % cnt == 0) {
                writer.write(cnt + "\n");
                num /= cnt;
            } else {
                cnt++;
            }
        }

        writer.flush();
        writer.close();
    }
}
