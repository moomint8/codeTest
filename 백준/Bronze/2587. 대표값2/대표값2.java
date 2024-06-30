import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arr = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(reader.readLine());
            arr.add(input);
            sum += input;
        }

        Collections.sort(arr);
        writer.write((sum / 5) + "\n");
        writer.write(arr.get(2) + "");
        writer.flush();
    }
}