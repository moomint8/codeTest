import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalScore = 0;
        double totalGrade = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
            st.nextToken();
            double subjectScore = Double.parseDouble(st.nextToken());
            String subjectGrade = st.nextToken();


            if (!subjectGrade.equals("P")) {
                totalScore += subjectScore;

                if(subjectGrade.equals("A+")){
                    totalGrade += 4.5 * subjectScore;
                } else if (subjectGrade.equals("A0")) {
                    totalGrade +=  4.0 * subjectScore;
                } else if (subjectGrade.equals("B+")) {
                    totalGrade +=  3.5 * subjectScore;
                } else if (subjectGrade.equals("B0")) {
                    totalGrade +=  3.0 * subjectScore;
                } else if (subjectGrade.equals("C+")) {
                    totalGrade +=  2.5 * subjectScore;
                } else if (subjectGrade.equals("C0")) {
                    totalGrade +=  2.0 * subjectScore;
                } else if (subjectGrade.equals("D+")) {
                    totalGrade +=  1.5 * subjectScore;
                } else if (subjectGrade.equals("D0")) {
                    totalGrade += 1.0 * subjectScore;
                }
            }
        }

        bufferedWriter.write((totalGrade / totalScore) + "");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}