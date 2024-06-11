import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor) {
        if (number < 2)
            return false;
        if (divisor == 1)
            return true;
        if (number % divisor == 0)
            return false;
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        boolean result = isPrime(number, number - 1);

        if (result)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");

        scan.close();
    }
}
