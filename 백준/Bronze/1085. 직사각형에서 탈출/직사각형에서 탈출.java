import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int shortX;
        int shortY;

        if (x > (w / 2)) {
            shortX = w - x;
        } else {
            shortX = x;
        }
        if (y > (h / 2)) {
            shortY = h - y;
        } else {
            shortY = y;
        }

        if (shortX > shortY) {
            writer.write(shortY + "\n");
        } else {
            writer.write(shortX + "\n");
        }

        writer.flush();
        writer.close();
    }
}