import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int sangNum = Integer.parseInt(reader.readLine());
        int[] sang = new int[sangNum];
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < sangNum; i++) {
            sang[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sang);

        int arrLen = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < arrLen; i++) {
            writer.write((isExistNum(Integer.parseInt(st.nextToken()), sang)) + " ");
        }
        writer.flush();
        writer.close();
    }

    private static int isExistNum(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}