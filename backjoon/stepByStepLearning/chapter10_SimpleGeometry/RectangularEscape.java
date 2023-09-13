package backjoon.stepByStepLearning.chapter10_SimpleGeometry;

/*
직사각형에서 탈출

문제
한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의
경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 x, y, w, h가 주어진다.

출력
첫째 줄에 문제의 정답을 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class RectangularEscape {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int shortX;
        int shortY;

        if (x > (w / 2)) {
            shortX = w - x;
        } else {
            shortX = x;
        }
        if (y > (h / 2)) {
            shortY = h - y;
        } else {
            shortY = y;
        }

        if (shortX > shortY) {
            writer.write(shortY + "\n");
        } else {
            writer.write(shortX + "\n");
        }

        writer.flush();
        writer.close();
    }
}
