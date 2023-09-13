package backjoon.stepByStepLearning.chapter10_SimpleGeometry;

/*
직사각형

문제
정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.

입력
표준 입력에 다음과 같은 형태로 입력이 주어진다.
A
B

출력
세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
 */

import java.io.*;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        writer.write((a * b) + "\n");

        writer.flush();
        writer.close();
    }
}
