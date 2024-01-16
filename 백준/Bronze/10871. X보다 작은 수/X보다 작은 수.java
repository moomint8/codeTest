import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int lengthNumber = Integer.parseInt(st.nextToken());
        int goalNumber = Integer.parseInt(st.nextToken());

        String[] inputLine = reader.readLine().split(" ");

        int[] testcase = new int[lengthNumber];

        for (int i = 0; i < lengthNumber; i++) {
            testcase[i] = Integer.parseInt(inputLine[i]);
        }

        for (int i = 0; i < lengthNumber; i++) {
            if(testcase[i] < goalNumber) {
                writer.write(testcase[i] + " ");
            };
        }

        writer.flush();
        writer.close();
    }
}