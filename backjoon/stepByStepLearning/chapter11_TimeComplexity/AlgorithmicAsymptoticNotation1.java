package backjoon.stepByStepLearning.chapter11_TimeComplexity;

/*
알고리즘 수업 - 점근적 표기 1

문제
오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.

O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}

이 정의는 실제 O-표기법(https://en.wikipedia.org/wiki/Big_O_notation)과 다를 수 있다.

함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.

입력
첫째 줄에 함수 f(n)을 나타내는 정수 a1, a0가 주어진다. (0 ≤ |ai| ≤ 100)

다음 줄에 양의 정수 c가 주어진다. (1 ≤ c ≤ 100)

다음 줄에 양의 정수 n0가 주어진다. (1 ≤ n0 ≤ 100)

출력
f(n), c, n0가 O(n) 정의를 만족하면 1, 아니면 0을 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class AlgorithmicAsymptoticNotation1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int[] fn = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int c = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int isTrue = 1;

        if (c < fn[0]) {
            isTrue = 0;
        }
        if ((c - fn[0]) * n < fn[1]) {
            isTrue = 0;
        }

        writer.write(isTrue + "");

        writer.flush();
        writer.close();
    }
}
