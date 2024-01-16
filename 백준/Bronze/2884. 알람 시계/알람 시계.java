import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        if (min >= 45){
            System.out.println(hour + " " + (min-45));
        } else if (hour > 0) {
            System.out.println((hour-1) + " " + (15 + min));
        } else {
            System.out.println(23 + " " + (15+min));
        }
    }
}