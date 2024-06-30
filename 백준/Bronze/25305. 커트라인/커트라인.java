import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        int num = Integer.parseInt(tokenizer.nextToken());
        int cutLine = Integer.parseInt(tokenizer.nextToken());

        input = reader.readLine();
        tokenizer = new StringTokenizer(input, " ");

        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(tokenizer.nextToken()));
        }
        Collections.sort(arr);

        writer.write(arr.get(num - cutLine) + "");
        writer.flush();
    }
}