import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        String number = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        int decimalNum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = (int)Math.pow(base, number.length() - 1 - i);
            if (number.charAt(i) < 58) {
                decimalNum += (number.charAt(i) - 48) * digit;
            } else {
                decimalNum += (number.charAt(i) - 55) * digit;
            }
        }

        writer.write(decimalNum + "\n");

        writer.flush();
        writer.close();
    }
}