import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a * (b - ((b / 10) * 10)));
        System.out.println(a * (((b - ((b / 100) * 100))/10)));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}