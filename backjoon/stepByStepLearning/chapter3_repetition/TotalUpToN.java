package backjoon.stepByStepLearning.chapter3_repetition;

/*
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
 */

import java.util.Scanner;

public class TotalUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result = 1;

        for(int i = 2; i <= num; i++){
            result += i;
        }
        System.out.println(result);

        scanner.close();
    }
}
