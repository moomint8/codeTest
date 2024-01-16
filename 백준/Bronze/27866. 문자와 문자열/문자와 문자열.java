import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String testcase = reader.readLine();

        int location = Integer.parseInt(reader.readLine()) - 1;

        System.out.println(testcase.substring(location,location + 1));
    }
}