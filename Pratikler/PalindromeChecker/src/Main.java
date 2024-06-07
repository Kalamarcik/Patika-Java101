public class Main {
    static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);

        if (number == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
    static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int number = 75433457;

        if (isPalindrome(75433457))
            System.out.println(number + " is a palindromic number.");
        else
            System.out.println(number + " is not a palindromic number.");

    }
}
