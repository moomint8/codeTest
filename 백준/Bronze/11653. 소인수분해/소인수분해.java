import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        int cnt = 2;

        boolean[] prime = new boolean[num + 1];

        for (int i = 2; i < (int)Math.sqrt(num) + 1; i++) {
            if(prime[i]) { continue; }

            for (int j = i + i; j <= num; j += i) {
                prime[j] = true;
            }
        }

        while (num >= cnt) {
            while (prime[cnt]) {
                cnt++;
            }
            if (num % cnt == 0) {
                writer.write(cnt + "\n");
                num /= cnt;
            } else {
                cnt++;
            }
        }

        writer.flush();
        writer.close();
    }
}