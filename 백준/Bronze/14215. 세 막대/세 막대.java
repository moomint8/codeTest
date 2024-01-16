import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int temp = a;

        if (temp < b) {
            temp = b;
        }
        if (temp < c) {
            temp = c;
        }

        if ((a + b + c - temp) > temp) {
            writer.write((a + b + c) + "");
        } else {
            writer.write(((2 * (a + b + c - temp)) - 1) + "");
        }

        writer.flush();
        writer.close();
    }
}