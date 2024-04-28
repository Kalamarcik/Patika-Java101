import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter the number:");
            i = scan.nextInt();
            if (i % 4 == 0) {
                sum += i;


            }
        } while (i % 2 == 0);


        System.out.println("Total:" + sum);
    }
}
