import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b && b == c){
            System.out.println(10000 + (a*1000));
        } else {
            int[] dice = {a, b, c};
            Arrays.sort(dice);
            if(dice[0] == dice[1] || dice[1] == dice[2]){
                System.out.println(1000 + (100*dice[1]));
            } else {
                System.out.println(100*dice[2]);
            }
        }
    }
}