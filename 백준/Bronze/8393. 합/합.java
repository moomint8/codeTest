import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result = 1;

        for(int i = 2; i <= num; i++){
            result += i;
        }
        System.out.println(result);

        scanner.close();
    }
}