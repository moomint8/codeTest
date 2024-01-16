import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int[] testcase = IntStream.range(0, Integer.parseInt(st.nextToken()) + 1).toArray();
        int tryNumber = Integer.parseInt(st.nextToken());

        for (int i = 0; i < tryNumber; i++) {
            StringTokenizer inputLine = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(inputLine.nextToken());
            int end = Integer.parseInt(inputLine.nextToken());
            for (int j = 0; j < Math.round((end - start) / 2.0); j++) {
                int temp = testcase[start + j];
                testcase[start + j] = testcase[end - j];
                testcase[end - j] = temp;
            }
        }

        for (int i = 1; i < testcase.length; i++) {
            writer.write(testcase[i] + " ");
        }

        writer.flush();
        writer.close();
    }
}