import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        int k;
        double average;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        k = scan.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }


        }
        if (count > 0) {
            average = (sum / count);
            System.out.println("Average:" + average);


        } else {
            System.out.println("No number between 0 and" + k + "that is divisible by 3 and 4 was found.");


        }
    }
}


