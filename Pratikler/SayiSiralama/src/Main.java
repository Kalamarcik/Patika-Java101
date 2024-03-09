import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayı:");
        a = scan.nextInt();

        System.out.print("2. sayı:");
        b = scan.nextInt();

        System.out.print("3. sayı:");
        c = scan.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c ");
            } else
                System.out.println("a < c < b");


        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else
                System.out.println("b < c < a");
        } else {
            if (a < b) {
                System.out.println("c < a < b");
            } else
                System.out.println("c < b < a");
        }


    }
}

