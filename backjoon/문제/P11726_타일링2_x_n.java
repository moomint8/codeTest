package backjoon.문제;

import java.io.*;

/*
        문제
        2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

        출력
        첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
     */

public class P11726_타일링2_x_n {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
        }


        bw.write(arr[n] + "");
        bw.flush();
        bw.close();
    }
}
