import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            writer.write(arr[i] + "\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}