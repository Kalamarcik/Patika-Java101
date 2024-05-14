import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java program that calculates the harmonic series of the entered number
        int n;
        double sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n):");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;

        }
        System.out.println("Harmonic series of " + n + " is: " + sum);

    }
}