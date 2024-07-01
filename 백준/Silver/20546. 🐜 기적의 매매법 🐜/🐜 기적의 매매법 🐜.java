import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int initialMoney = Integer.parseInt(reader.readLine());
        int[] prices = new int[14];
        
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < 14; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        // 준현이의 BNP 전략
        int junMoney = initialMoney;
        int junStocks = 0;
        for (int i = 0; i < 14; i++) {
            if (junMoney >= prices[i]) {
                junStocks += junMoney / prices[i];
                junMoney %= prices[i];
            }
        }
        int junTotal = junMoney + junStocks * prices[13];

        // 성민이의 TIMING 전략
        int sungMoney = initialMoney;
        int sungStocks = 0;
        int upDays = 0, downDays = 0;

        for (int i = 1; i < 14; i++) {
            if (prices[i] > prices[i-1]) {
                upDays++;
                downDays = 0;
            } else if (prices[i] < prices[i-1]) {
                downDays++;
                upDays = 0;
            } else {
                upDays = 0;
                downDays = 0;
            }

            if (upDays >= 3) {
                sungMoney += sungStocks * prices[i];
                sungStocks = 0;
            } else if (downDays >= 3) {
                int buyAmount = sungMoney / prices[i];
                sungStocks += buyAmount;
                sungMoney -= buyAmount * prices[i];
            }
        }
        int sungTotal = sungMoney + sungStocks * prices[13];

        if (junTotal > sungTotal) {
            writer.write("BNP\n");
        } else if (junTotal < sungTotal) {
            writer.write("TIMING\n");
        } else {
            writer.write("SAMESAME\n");
        }

        writer.flush();
        writer.close();
    }
}