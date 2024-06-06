import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many terms of the Fibonacci sequence do you want? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci Sequence: 0");
        } else {
            int num1 = 0, num2 = 1;
            System.out.print("Fibonacci Sequence: " + num1 + " " + num2);

            for (int i = 2; i < n; i++) {
                int num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
    }
}