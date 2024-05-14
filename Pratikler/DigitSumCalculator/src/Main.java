import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, digitSum = 0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number to sum its digits:");
        number = scan.nextInt();

        while (number != 0) {

            digitSum += number % 10;
            number = number / 10;

        }
        System.out.println("Sum of digits:" + digitSum);


    }
}