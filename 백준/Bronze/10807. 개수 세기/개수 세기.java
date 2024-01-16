import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());

        int[] testcase = new int[length];

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        int goalNumber = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 0; i < length; i++) {
            if(goalNumber == Integer.parseInt(st.nextToken())) count++;
        }

        System.out.println(count);
    }
}