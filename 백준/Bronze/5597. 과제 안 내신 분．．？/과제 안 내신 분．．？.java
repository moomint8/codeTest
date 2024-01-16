import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter((new OutputStreamWriter(System.out)));

        int[] member = IntStream.range(1, 31).toArray();

        for (int i = 0; i < 28; i++) {
            int submitMember = Integer.parseInt(reader.readLine());
            member[submitMember - 1] = 0;
        }

        for (int i = 0; i < 30; i++) {
            if (member[i] != 0) {
                writer.write(member[i] + "\n");
            }
        }

        writer.flush();
        writer.close();
    }
}