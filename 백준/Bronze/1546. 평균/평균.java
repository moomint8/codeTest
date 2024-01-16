import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] score = new double[Integer.parseInt(reader.readLine())];
        double maxScore = 0;
        double avg = 0;

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if(score[i] > maxScore){
                maxScore = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            avg += score[i] / maxScore;
        }

        System.out.println(String.format("%.3f", (avg / score.length) * 100));
    }
}