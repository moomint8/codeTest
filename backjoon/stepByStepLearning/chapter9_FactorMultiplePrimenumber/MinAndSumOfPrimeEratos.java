package backjoon.stepByStepLearning.chapter9_FactorMultiplePrimenumber;

/*
MinAndSumOfPrime 에라토스테네스 버전
 */

import java.io.*;

public class MinAndSumOfPrimeEratos {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int min = 0;
        int sum = 0;

        boolean[] prime = new boolean[n + 1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < (int)Math.sqrt(n) + 1; i++) {
            if(prime[i]) { continue; }

            for (int j = i + i; j <= n; j += i) {
                prime[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            writer.write(-1 + "\n");
        } else {
            writer.write(sum + "\n" + min + "\n");
        }

        writer.flush();
        writer.close();
    }
}
