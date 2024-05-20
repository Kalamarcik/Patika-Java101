import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, gcd = 1, k = 1, lcm = 0, i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number:");
        n1 = scan.nextInt();
        System.out.print("Enter the second number:");
        n2 = scan.nextInt();

        while (k != n1 + 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("GCD:" + gcd);


        while (i != ((n1 * n2) + 1)) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("LCM:" + lcm);
    }
}