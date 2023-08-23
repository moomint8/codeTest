package backjoon.stepByStepLearning.chapter6_DeepeningPhaseOne;

/*
문제
아래 예제와 같이 새싹을 출력하시오.

입력
입력은 없다.

출력
새싹을 출력한다.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Sprout {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("         ,r'\"7" + "\n" +
                "r`-_   ,'  ,/" + "\n" +
                " \\. \". L_r'" + "\n" +
                "   `~\\/" + "\n" +
                "      |" + "\n" +
                "      |" + "\n");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
