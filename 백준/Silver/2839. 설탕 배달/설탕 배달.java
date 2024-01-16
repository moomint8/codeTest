import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int weight = Integer.parseInt(reader.readLine());
        int fiveNum = weight / 5;
        int sum;

        while (true) {
            if ((weight - (fiveNum * 5)) % 3 == 0) {
                sum = fiveNum + ((weight - (fiveNum * 5)) / 3);
                break;
            } else if (fiveNum == 0) {
                sum = -1;
                break;
            } else {
                fiveNum--;
            }
        }

        writer.write(sum + "");

        writer.flush();
        writer.close();
    }
}