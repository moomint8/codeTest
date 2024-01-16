import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        bufferedWriter.write((1 - Integer.parseInt(st.nextToken())) + " ");
        bufferedWriter.write((1 - Integer.parseInt(st.nextToken())) + " ");
        bufferedWriter.write((2 - Integer.parseInt(st.nextToken())) + " ");
        bufferedWriter.write((2 - Integer.parseInt(st.nextToken())) + " ");
        bufferedWriter.write((2 - Integer.parseInt(st.nextToken())) + " ");
        bufferedWriter.write((8 - Integer.parseInt(st.nextToken())) + "");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}