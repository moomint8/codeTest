import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean[] testcase = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            testcase[Integer.parseInt(reader.readLine()) % 42] = true;
        }

        for (int i = 0; i < testcase.length; i++) {
            if (testcase[i] == true) {
                count++;
            }
        }

        System.out.println(count);
    }
}