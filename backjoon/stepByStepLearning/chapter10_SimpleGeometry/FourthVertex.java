package backjoon.stepByStepLearning.chapter10_SimpleGeometry;

/*
네 번째 점

문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class FourthVertex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine(), " ");

        int tempX = Integer.parseInt(st.nextToken());
        int tempY = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine(), " ");

        if (x == tempX) {
            x = Integer.parseInt(st.nextToken());
        } else if (x == Integer.parseInt(st.nextToken())) {
            x = tempX;
        }
        if (y == tempY) {
            y = Integer.parseInt(st.nextToken());
        } else if (y == Integer.parseInt(st.nextToken())) {
            y = tempY;
        }

        writer.write(x + " " + y + "\n");

        writer.flush();
        writer.close();
    }
}
