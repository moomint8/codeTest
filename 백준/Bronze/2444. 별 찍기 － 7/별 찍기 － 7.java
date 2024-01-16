import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                bufferedWriter.append(" ");
            }
            for (int j = 0; j < ((i + 1) * 2) - 1; j++) {
                bufferedWriter.append("*");
            }
            bufferedWriter.append("\n");
        }
        for (int i = number - 1; i > 0; i--) {
//            for (int j = 0; j < i + 1; j++) {
//                bufferedWriter.append(" ");
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
            for (int j = 0; j < number - i; j++) {
                bufferedWriter.append(" ");
            }
            for (int j = 0; j < ((i + 1) * 2) - 3; j++) {
                bufferedWriter.append("*");
            }
            bufferedWriter.append("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}