package backjoon.stepByStepLearning.chapter4_one_dimensional_array;

/*
문제
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽
바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그
범위에 들어있는 바구니의 순서를 역순으로 만든다.
바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는
프로그램을 작성하시오.

입력
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의
순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

출력
모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class FlipTheBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int[] testcase = IntStream.range(0, Integer.parseInt(st.nextToken()) + 1).toArray();
        int tryNumber = Integer.parseInt(st.nextToken());

        for (int i = 0; i < tryNumber; i++) {
            StringTokenizer inputLine = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(inputLine.nextToken());
            int end = Integer.parseInt(inputLine.nextToken());
            for (int j = 0; j < Math.round((end - start) / 2.0); j++) {
                int temp = testcase[start + j];
                testcase[start + j] = testcase[end - j];
                testcase[end - j] = temp;
            }
        }

        for (int i = 1; i < testcase.length; i++) {
            writer.write(testcase[i] + " ");
        }

        writer.flush();
        writer.close();
    }
}
