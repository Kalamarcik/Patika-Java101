import java.util.Scanner;

public class Main {

    static void patternMinus(int number, int original) {
        if (number > 0) {
            System.out.print(number + " ");
            patternMinus(number - 5, original);
        } else {
            System.out.print(number + " ");
            patternPlus(number + 5, original);
        }
    }

    static void patternPlus(int number, int original) {
        if (number <= original) {
            System.out.print(number + " ");
            if (number < original) {
                patternPlus(number + 5, original);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        patternMinus(number, number);
    }
}
