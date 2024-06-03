import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height of the triangle:");
        int number = scan.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}