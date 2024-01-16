import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(reader.readLine());

        for(int i=0; i< testcase; i++){
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            writer.write(("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n"));
        }

        writer.flush();
        writer.close();
    }
}