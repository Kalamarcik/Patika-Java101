import java.util.Scanner;

public class Main {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Result: " + result);

        scan.close();
    }


}
