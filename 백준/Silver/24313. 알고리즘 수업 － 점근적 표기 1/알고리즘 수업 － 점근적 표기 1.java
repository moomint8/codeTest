import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int[] fn = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int c = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int isTrue = 1;

        if (c < fn[0]) {
            isTrue = 0;
        }
        if ((c - fn[0]) * n < fn[1]) {
            isTrue = 0;
        }

        writer.write(isTrue + "");

        writer.flush();
        writer.close();
    }
}