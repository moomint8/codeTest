import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String testcase = bufferedReader.readLine();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < testcase.length(); i++) {
            if(alphabet[testcase.charAt(i) - 97] == -1){
                alphabet[testcase.charAt(i) - 97] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            bufferedWriter.write(alphabet[i] + " ");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}