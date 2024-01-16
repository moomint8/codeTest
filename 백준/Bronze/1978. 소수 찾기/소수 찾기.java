import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        writer.write(cnt + "\n");

        writer.flush();
        writer.close();
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < (num / 2) + 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}