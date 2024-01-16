import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int min = 55;

        boolean[][] testcase = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String board = reader.readLine();
            for (int j = 0; j < m; j++) {
                if (board.charAt(j) == 'W') {
                    testcase[i][j] = true;
                } else {
                    testcase[i][j] = false;
                }
            }
        }

        int[] point = {0, 0};
        int sum = 0;

        while (point[0] + 8 <= n) {
            while (point[1] + 8 <= m) {
                for (int i = point[0]; i < point[0] + 8; i += 2) {
                    for (int j = point[1]; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] != testcase[i][j]) {
                            sum++;
                        }
                    }
                    for (int j = point[1] + 1; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] == testcase[i][j]) {
                            sum++;
                        }
                    }
                }
                for (int i = point[0] + 1; i < point[0] + 8; i += 2) {
                    for (int j = point[1]; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] == testcase[i][j]) {
                            sum++;
                        }
                    }
                    for (int j = point[1] + 1; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] != testcase[i][j]) {
                            sum++;
                        }
                    }
                }
                if (sum < min) {
                    min = sum;
                }
                sum = 0;

                testcase[point[0]][point[1]] = !testcase[point[0]][point[1]];
                for (int i = point[0]; i < point[0] + 8; i += 2) {
                    for (int j = point[1]; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] != testcase[i][j]) {
                            sum++;
                        }
                    }
                    for (int j = point[1] + 1; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] == testcase[i][j]) {
                            sum++;
                        }
                    }
                }
                for (int i = point[0] + 1; i < point[0] + 8; i += 2) {
                    for (int j = point[1]; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] == testcase[i][j]) {
                            sum++;
                        }
                    }
                    for (int j = point[1] + 1; j < point[1] + 8; j += 2) {
                        if (testcase[point[0]][point[1]] != testcase[i][j]) {
                            sum++;
                        }
                    }
                }
                if (sum + 1 < min) {
                    min = sum + 1;
                }
                sum = 0;
                point[1]++;
            }
            point[0]++;
            point[1] = 0;
        }

        writer.write(min + "");

        writer.flush();
        writer.close();
    }
}