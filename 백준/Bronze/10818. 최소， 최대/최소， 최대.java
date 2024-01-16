import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrLength = Integer.parseInt(reader.readLine());
        String[] inputLine = reader.readLine().split(" ");

        int[] testcase = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            testcase[i] = Integer.parseInt(inputLine[i]);
        }
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < arrLength; i++) {
            if(testcase[i] > max) { max = testcase[i]; }
            if(testcase[i] < min) { min = testcase[i]; }
        }

        writer.write(min + " " + max);

        writer.flush();
        writer.close();
    }
}