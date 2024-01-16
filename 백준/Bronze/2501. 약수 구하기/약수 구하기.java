import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int mainNum = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int factor = 0;

        for (int i = 1; i < (mainNum / 2 + 1); i++) {
            if (mainNum % i == 0) {
                cnt++;
                if (cnt == num) {
                    factor = i;
                    break;
                }
            }
        }
        if (num == cnt + 1) {
            factor = mainNum;
        }

        writer.write(factor + "\n");

        writer.flush();
        writer.close();
    }
}