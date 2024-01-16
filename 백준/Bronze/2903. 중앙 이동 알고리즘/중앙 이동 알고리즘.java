import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNumber = Integer.parseInt(reader.readLine());
        int sum = 2;

        for (int i = 0; i < tryNumber; i++) {
            sum += sum - 1;
        }

        writer.write((int)Math.pow(sum, 2) + "\n");

        writer.flush();
        writer.close();
    }
}