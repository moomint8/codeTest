import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            Arrays.fill(matrix[i], 0);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < row; j++) {
                StringTokenizer stMatrix = new StringTokenizer(bufferedReader.readLine(), " ");
                for (int k = 0; k < col; k++) {
                    matrix[j][k] += Integer.parseInt(stMatrix.nextToken());
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                bufferedWriter.append(matrix[i][j] + " ");
            }
            bufferedWriter.append("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}