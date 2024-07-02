import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        String sign = getSign(a, b, c);
        if (sign == null) {
            writer.write(a + "=" + b + getSign(b, c, a) + c);
        } else {
            writer.write(a + sign + b + "=" + c);
        }

        writer.flush();
        writer.close();
    }

    private static String getSign(int a, int b, int c) {
        if (a + b == c) {
            return "+";
        }
        if (a - b == c) {
            return "-";
        }
        if (a * b == c) {
            return "*";
        }
        if (a / b == c) {
            return "/";
        }
        return null;
    }
}