import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(reader.readLine());

            if (num == -1) {
                break;
            } else if (num == 1) {
                writer.write(num + " is NOT perfect.\n");
            } else {
                int sum = 1;

                writer.write(num + " = " + 1 + "");

                for (int i = 2; i < (num / 2) + 1; i++) {
                    if (num % i == 0) {
                        writer.write(" + " + i);
                        sum += i;
                    }
                }

                if (num == sum) {
                    writer.write("\n");
                } else {
                    writer = new BufferedWriter(new OutputStreamWriter(System.out));
                    writer.write(num + " is NOT perfect.\n");
                }
            }

            writer.flush();
        }

        writer.close();
    }
}