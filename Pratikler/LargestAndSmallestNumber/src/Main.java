import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, number, largestNumber, smallestNumber, firstNumber;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?:");
        n = scan.nextInt();

        System.out.print("Enter the 1st number:");
        firstNumber = scan.nextInt();

        largestNumber = firstNumber;
        smallestNumber = firstNumber;

        for (int i = 2; i <= n; i++) {

            System.out.print("Enter the " + i + "th number:");
            number = scan.nextInt();

            if (number <= smallestNumber) {
                smallestNumber = number;
            }

            if (number >= largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
