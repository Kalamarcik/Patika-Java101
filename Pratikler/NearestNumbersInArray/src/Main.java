import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        int[] newArray = new int[list.length + 1];

        for (int i = 0; i < list.length; i++) {
            newArray[i] = list[i];
        }
        newArray[list.length] = number;

        Arrays.sort(newArray);
        int index = Arrays.binarySearch(newArray, number);
        System.out.println("The closest smaller number to the entered number: " + newArray[index - 1]);
        System.out.println("The closest larger number to the entered number: " + newArray[index + 1]);
    }
}
