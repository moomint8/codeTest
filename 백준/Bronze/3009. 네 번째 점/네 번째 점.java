import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine(), " ");

        int tempX = Integer.parseInt(st.nextToken());
        int tempY = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine(), " ");

        if (x == tempX) {
            x = Integer.parseInt(st.nextToken());
        } else if (x == Integer.parseInt(st.nextToken())) {
            x = tempX;
        }
        if (y == tempY) {
            y = Integer.parseInt(st.nextToken());
        } else if (y == Integer.parseInt(st.nextToken())) {
            y = tempY;
        }

        writer.write(x + " " + y + "\n");

        writer.flush();
        writer.close();
    }
}