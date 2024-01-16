import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Integer.parseInt(reader.readLine());

        writer.write((num * num * num) + "\n3");

        writer.flush();
        writer.close();
    }
}