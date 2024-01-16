import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int inputNumber = Integer.parseInt(reader.readLine());
            if (inputNumber > max) {
                max = inputNumber;
                count = i + 1;
            }
        }
        writer.write(max + "\n" + count);

        writer.flush();
        writer.close();
    }
}