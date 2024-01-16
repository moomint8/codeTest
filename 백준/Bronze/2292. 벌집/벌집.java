import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int goalNum = Integer.parseInt(reader.readLine());
        int tryNum = 1;
        int finderNum = 1;
        int addNum = 6;

        while (finderNum < goalNum) {
            finderNum += addNum;
            addNum += 6;
            tryNum += 1;
        }

        writer.write(tryNum + "\n");

        writer.flush();
        writer.close();
    }
}