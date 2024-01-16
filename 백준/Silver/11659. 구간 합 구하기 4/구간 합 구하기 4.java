import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 배열크기, 시행횟수 입력
        String input = br.readLine();
        st = new StringTokenizer(input, " ");
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int number = Integer.parseInt(st.nextToken());

        // 배열 값 입력
        input = br.readLine();
        st = new StringTokenizer(input, " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrSum = getArrSum(arr);

        for (int i = 0; i < number; i++) {
            getPartSum(arrSum);
        }

        bw.flush();
        bw.close();
    }

    private static int[] getArrSum(int[] arr) {
        int[] arrSum = new int[arr.length + 1];
        arrSum[0] = 0;
        arrSum[1] = arr[0];
        for (int i = 2; i < arrSum.length; i++) {
            arrSum[i] = arrSum[i - 1] + arr[i - 1];
        }

        return arrSum;
    }

    private static void getPartSum(int[] arrSum) throws IOException {
        st = new StringTokenizer(br.readLine(), " ");

        int sum = -(arrSum[Integer.parseInt(st.nextToken()) - 1]) + arrSum[Integer.parseInt(st.nextToken())];

        bw.write(sum + "\n");
    }
}