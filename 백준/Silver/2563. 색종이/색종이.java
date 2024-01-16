import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] drawingPaper = new int[100][100];
        int area = 0;

        for (int i = 0; i < 100; i++) {
            Arrays.fill(drawingPaper[i], 0);
        }

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (drawingPaper[j + x][k + y] != 1) {
                        drawingPaper[j + x][k + y] = 1;
                        area++;
                    }
                }
            }
        }

        writer.write(area + "\n");

        writer.flush();
        writer.close();
    }
}