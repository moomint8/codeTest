import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int hour = Integer.parseInt(reader.readLine());
        int minuit = Integer.parseInt(reader.readLine());

        if (minuit == 0) {
            writer.write(getHour(hour) + " o' clock");
        } else if (minuit == 15) {
            writer.write("quarter past " + getHour(hour));
        } else if (minuit == 30) {
            writer.write("half past " + getHour(hour));
        } else if (minuit == 45) {
            writer.write("quarter to " + getHour(hour + 1));
        } else if (minuit < 30) {
            writer.write(getMin(minuit) + "past " + getHour(hour));
        } else {
            writer.write(getMin(60 - minuit) + "to " + getHour(hour + 1));
        }

        writer.flush();
        writer.close();
    }

    private static String getHour(int hour) {
        return switch (hour) {
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            default -> "one";
        };
    }

    private static String getMin(int min) {
        return switch (min) {
            case 1 -> "one minute ";
            case 2 -> "two minutes ";
            case 3 -> "three minutes ";
            case 4 -> "four minutes ";
            case 5 -> "five minutes ";
            case 6 -> "six minutes ";
            case 7 -> "seven minutes ";
            case 8 -> "eight minutes ";
            case 9 -> "nine minutes ";
            case 10 -> "ten minutes ";
            case 11 -> "eleven minutes ";
            case 12 -> "twelve minutes ";
            case 13 -> "thirteen minutes ";
            case 14 -> "fourteen minutes ";
            case 16 -> "sixteen minutes ";
            case 17 -> "seventeen minutes ";
            case 18 -> "eighteen minutes ";
            case 19 -> "nineteen minutes ";
            case 20 -> "twenty minutes ";
            case 21 -> "twenty one minutes ";
            case 22 -> "twenty two minutes ";
            case 23 -> "twenty three minutes ";
            case 24 -> "twenty four minutes ";
            case 25 -> "twenty five minutes ";
            case 26 -> "twenty six minutes ";
            case 27 -> "twenty seven minutes ";
            case 28 -> "twenty eight minutes ";
            case 29 -> "twenty nine minutes ";
            default -> "";
        };
    }
}