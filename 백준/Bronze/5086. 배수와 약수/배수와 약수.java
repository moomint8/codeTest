import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            String msg = "neither";

            if (first == 0 && second == 0) {
                break;
            } else if (first > second && (first % second) == 0) {
                msg = "multiple";
            } else if (first < second && (second % first) == 0) {
                msg = "factor";
            }

            writer.write(msg + "\n");
        }

        writer.flush();
        writer.close();
    }
}