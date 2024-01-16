import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int goalNum = Integer.parseInt(reader.readLine());

        int startNum = 1;
        int addNum = 1;

        while (true) {
            startNum += addNum;
            if(startNum > goalNum){
                startNum -= addNum;
                break;
            }
            addNum++;
        }

        int denominator;
        int numerator;

        if (addNum % 2 == 0) {
            denominator = addNum;
            numerator = 1;
            for (int i = 0; i < goalNum - startNum; i++) {
                denominator--;
                numerator++;
            }
        } else {
            denominator = 1;
            numerator = addNum;
            for (int i = 0; i < goalNum - startNum; i++) {
                denominator++;
                numerator--;
            }
        }

        writer.write(numerator + "/" + denominator + "\n");

        writer.flush();
        writer.close();
    }
}