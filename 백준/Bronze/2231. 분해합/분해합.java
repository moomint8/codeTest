import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int[] testcase = {0, 0, 0, 0, 0, 0, 1};
        int sum = 0;

        int mul = 1;

        
            for (int i = 1; i < num; i++) {
                for (int j = 0; j <= 6; j++) {
                    sum += testcase[6 - j] * mul + testcase[6 - j];
                    mul *= 10;
                }
                mul = 1;

                if (sum == num) {
                    sum = 0;
                    for (int j = 0; j <= 6; j++) {
                        sum += testcase[6 - j] * mul;
                        mul *= 10;
                    }
                    break;
                } else {
                    testcase[6]++;
                    for (int j = 6; j > 0; j--) {
                        if (testcase[j] == 10) {
                            testcase[j] = 0;
                            testcase[j - 1]++;
                        }
                    }
                    sum = 0;
                }
            }
        
        writer.write(sum + "");

        writer.flush();
        writer.close();
    }
}