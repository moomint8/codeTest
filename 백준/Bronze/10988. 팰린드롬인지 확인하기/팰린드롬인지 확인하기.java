import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();
        int result = 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = 0;
            }
        }

        bufferedWriter.write(result + "");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}