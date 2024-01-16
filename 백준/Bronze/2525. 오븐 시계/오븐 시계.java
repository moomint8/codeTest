import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        min = cookingTime % 60 + min;

        if(min >= 60){
            min -= 60;
            hour += 1 + (cookingTime / 60);
            if(hour >= 24){
                System.out.println((hour - 24) + " " + min);
            } else {
                System.out.println(hour + " " + min);
            }
        } else {
            hour += (cookingTime / 60);
            if(hour >= 24){
                System.out.println((hour - 24) + " " + min);
            } else {
                System.out.println(hour + " " + min);
            }
        }
    }
}