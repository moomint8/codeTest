import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(arr);

        for (int i = 0; i < num; i++) {
            writer.write(arr.get(i) + "\n");
        }
        writer.flush();
    }
}