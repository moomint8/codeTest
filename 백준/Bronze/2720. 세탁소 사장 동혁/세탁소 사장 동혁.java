import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNumber = Integer.parseInt(reader.readLine());

        for (int i = 0; i < tryNumber; i++) {
            int money = Integer.parseInt(reader.readLine());
            writer.append((money / 25) + " ");
            money %= 25;
            writer.append((money / 10) + " ");
            money %= 10;
            writer.append((money / 5) + " ");
            money %= 5;
            writer.append(money + "\n");
        }

        writer.flush();
        writer.close();
    }
}