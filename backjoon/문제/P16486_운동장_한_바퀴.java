package backjoon.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16486_운동장_한_바퀴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double pi = 3.141592;
        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());
        System.out.println((pi * d2 + d1) * 2);
    }
}
