import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int target = Integer.parseInt(reader.readLine());

        int[][] arr = new int[n][n];
        int targetLocX = 0;
        int targetLocY = 0;

        int x = 0;
        int y = 0;
        int num = n * n;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int direction = 0;
        while (num > 0) {
            arr[x][y] = num;
            if (num == target) {
                targetLocX = x;
                targetLocY = y;
            }

            int nextX = x + dx[direction];
            int nextY = y + dy[direction];

            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || arr[nextX][nextY] != 0) {
                direction = (direction + 1) % 4;
                nextX = x + dx[direction];
                nextY = y + dy[direction];
            }

            x = nextX;
            y = nextY;
            num--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                writer.write(arr[i][j] + " ");
            }
            writer.newLine();
        }
        writer.write((targetLocX + 1) + " " + (targetLocY + 1));

        writer.flush();
        writer.close();
    }
}