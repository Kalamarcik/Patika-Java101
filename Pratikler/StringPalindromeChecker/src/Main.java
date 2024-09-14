import java.util.Scanner;


public class Main {
    static String reverseWord(String strr, String reversed) {
        if (strr.isEmpty()) {
            return reversed;
        }
        return reverseWord(strr.substring(0, strr.length() - 1), reversed + strr.charAt(strr.length() - 1));
    }


    static boolean isPalindrome(String str) {
        return str.equals(reverseWord(str, ""));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the word you want to check:");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}