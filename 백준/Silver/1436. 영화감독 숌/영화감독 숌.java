import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine()) - 1;
        String testcase = "666";

        while (num != 0) {
            testcase = Integer.toString(Integer.parseInt(testcase) + 1);
            for (int i = 0; i < testcase.length() - 2; i++) {
                if (testcase.charAt(i) != '6') {
                    continue;
                } else if (testcase.charAt(i) == testcase.charAt(i + 1) &&
                        testcase.charAt(i) == testcase.charAt(i + 2)) {
                    num--;
                    break;
                }
            }
        }
        
        writer.write(testcase + "\n");

        writer.flush();
        writer.close();
    }
}