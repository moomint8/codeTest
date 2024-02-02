import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            bw.write(getResult(m) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static long getResult(int m) {
        if (m > 5) {
            long[] arr = new long[m + 1];
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 2;
            arr[5] = 2;
            for (int j = 6; j < m + 1; j++) {
                arr[j] = arr[j - 1] + arr[j - 5];
            }
            return arr[m];
        }
        if (m == 1) return 1;
        if (m == 2) return 1;
        if (m == 3) return 1;
        if (m == 4) return 2;
        if (m == 5) return 2;

        return 0;
    }
}