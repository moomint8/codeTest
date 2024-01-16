import java.io.*;
import java.util.Arrays;

public class Main {
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
        int checkMultiple = 0;

        for (int i = 1; i < alphabetNumber.length; i++) {
            if (alphabetNumber[i] == alphabetNumber[maxAlphaLoc]) {
                checkMultiple = 1;
            } else if (alphabetNumber[i] > alphabetNumber[maxAlphaLoc]) {
                maxAlphaLoc = i;
                checkMultiple = 0;
            }
        }

        if (checkMultiple == 1) {
            bufferedWriter.append("?");
        } else {
            bufferedWriter.append((char)(maxAlphaLoc + 65) + "");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}