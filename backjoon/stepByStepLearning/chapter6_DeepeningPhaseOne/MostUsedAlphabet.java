package backjoon.stepByStepLearning.chapter6_DeepeningPhaseOne;

/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

import java.io.*;
import java.util.Arrays;

public class MostUsedAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabetNumber = new int[26];
        Arrays.fill(alphabetNumber, 0);

        String testcase = bufferedReader.readLine();

        for (int i = 0; i < testcase.length(); i++) {
            if (testcase.charAt(i) < 91) {
                alphabetNumber[testcase.charAt(i) - 65] += 1;
            } else {
                alphabetNumber[testcase.charAt(i) - 97] += 1;
            }
        }

        int maxAlphaLoc = 0;
        boolean checkMultiple = false;

        for (int i = 1; i < alphabetNumber.length; i++) {
            if (alphabetNumber[i] == alphabetNumber[maxAlphaLoc]) {
                checkMultiple = true;
            } else if (alphabetNumber[i] > alphabetNumber[maxAlphaLoc]) {
                maxAlphaLoc = i;
                checkMultiple = false;
            }
        }

        if (checkMultiple) {
            bufferedWriter.append("?");
        } else {
            bufferedWriter.append((char)(maxAlphaLoc + 65) + "");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
