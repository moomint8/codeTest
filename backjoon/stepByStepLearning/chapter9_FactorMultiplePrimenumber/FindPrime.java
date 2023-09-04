package backjoon.stepByStepLearning.chapter9_FactorMultiplePrimenumber;

/*
소수 찾기

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class FindPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        writer.write(cnt + "\n");

        writer.flush();
        writer.close();
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < (num / 2) + 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


