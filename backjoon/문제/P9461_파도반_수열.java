package backjoon.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9461_파도반_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for (int j = 6; j < 101; j++) {
            arr[j] = arr[j - 1] + arr[j - 5];
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            System.out.println(arr[m]);
        }
    }
}
