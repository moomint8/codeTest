import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(abs(a) <= 10000 && abs(b) <= 10000){
            if(a > b){
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        }
    }
}