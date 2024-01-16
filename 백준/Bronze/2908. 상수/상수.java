import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        String firstNum = st.nextToken();
        String secondNum = st.nextToken();
        String bigNum;

        if (firstNum.charAt(2) == secondNum.charAt((2))) {
            if (firstNum.charAt(1) == secondNum.charAt((1))) {
                if (firstNum.charAt(0) > secondNum.charAt((0))) {
                    bigNum = firstNum;
                } else {
                    bigNum = secondNum;
                }
            } else if (firstNum.charAt(1) > secondNum.charAt((1))) {
                bigNum = firstNum;
            } else {
                bigNum = secondNum;
            }
        } else if (firstNum.charAt(2) > secondNum.charAt((2))) {
            bigNum = firstNum;
        } else {
            bigNum = secondNum;
        }

        bufferedWriter.append(bigNum.charAt(2)).append(bigNum.charAt(1)).append(bigNum.charAt(0));

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}