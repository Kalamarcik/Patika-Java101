import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted arrey: " + Arrays.toString(array));
    }
}