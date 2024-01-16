import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int a;
        int b;

        ArrayList result = new ArrayList();

        for(int i = 0; i < num; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            result.add(a + b);
        }
        for(int i = 0; i < num; i++){
            System.out.println(result.get(i));
        }
    }
}