import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        arr[1] = 1;
        if (n > 1) {
            arr[2] = 2;
            for (int i = 3; i < n + 1; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
            }
        }

        bw.write(arr[n] + "");
        bw.flush();
        bw.close();
    }
}