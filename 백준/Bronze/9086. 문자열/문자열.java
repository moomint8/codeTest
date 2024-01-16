import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNumber = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tryNumber; i++) {
            String testcase = bufferedReader.readLine();
            bufferedWriter.write(testcase.charAt(0));
            bufferedWriter.write(testcase.charAt(testcase.length() - 1) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}