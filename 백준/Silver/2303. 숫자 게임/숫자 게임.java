import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int manNum = Integer.parseInt(reader.readLine());
        int max = -1;
        int num = 0;

        for (int i = 0; i < manNum; i++) {
            int nowMaxNum = getMaxSum(reader.readLine());
            if (nowMaxNum >= max) {
                max = nowMaxNum;
                num = i + 1;
            }
        }

        writer.write(num + "\n");
        writer.close();
    }

    private static int getMaxSum(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");

        int[] arr = new int[5];
        int maxSum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int sum = (arr[i] + arr[j] + arr[k]) % 10;
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        return maxSum;
    }
}