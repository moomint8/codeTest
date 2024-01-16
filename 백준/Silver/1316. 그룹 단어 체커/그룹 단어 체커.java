import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNumber = Integer.parseInt(bufferedReader.readLine());

        int num = 0;

        for (int i = 0; i < tryNumber; i++) {
            int[] alphabet = new int[26];
            Arrays.fill(alphabet, 0);
            boolean checker = true;

            String testcase = bufferedReader.readLine();

            for (int j = 0; j < testcase.length() - 1; j++) {
                if (testcase.charAt(j) != testcase.charAt(j + 1)) {
                    if (alphabet[testcase.charAt(j) - 97] == 1) {
                        checker = false;
                    } else {
                        alphabet[testcase.charAt(j) - 97] = 1;
                    }
                }
            }
            if (alphabet[testcase.charAt(testcase.length() - 1) - 97] == 1) {
                checker = false;
            }

            if (checker) {
                num++;
            }
        }

        bufferedWriter.write(num + "");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}