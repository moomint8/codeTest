import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String phoneString = bufferedReader.readLine();
        int reqTime = 0;

        for (int i = 0; i < phoneString.length(); i++) {
            if (phoneString.charAt(i) >= 87) {
                reqTime += 8;
            } else if (phoneString.charAt(i) >= 84) {
                reqTime += 7;
            } else if (phoneString.charAt(i) >= 80) {
                reqTime += 6;
            } else if (phoneString.charAt(i) >= 77) {
                reqTime += 5;
            } else if (phoneString.charAt(i) >= 74) {
                reqTime += 4;
            } else if (phoneString.charAt(i) >= 71) {
                reqTime += 3;
            } else if (phoneString.charAt(i) >= 68) {
                reqTime += 2;
            } else {
                reqTime += 1;
            }
        }

        reqTime += phoneString.length() * 2;

        bufferedWriter.write(reqTime + "");
        bufferedWriter.flush();
    }
}