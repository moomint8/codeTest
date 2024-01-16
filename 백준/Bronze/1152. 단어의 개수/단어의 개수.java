import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = 1;

        String testcase = bufferedReader.readLine();

        if (testcase.charAt(0) == ' ') {
            number--;
        }
        if (testcase.charAt(testcase.length() - 1) == ' ') {
            number--;
        }

        for (int i = 0; i < testcase.length(); i++) {
            if (testcase.charAt(i) == ' ') {
                number++;
            }
        }

        bufferedWriter.write(number + "\n");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}