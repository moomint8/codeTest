import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        int strLen = input.length();
        int len = (int) Math.pow(10, strLen - 1);
        int[] arr = new int[strLen];

        for (int i = 0; i < strLen; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for (int i = 0; i < strLen; i++) {
            writer.write(arr[strLen - i - 1] + "");
        }

        writer.close();
    }
}