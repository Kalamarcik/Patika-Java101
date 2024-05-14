import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base,exponent,result=1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base:");
        base=scan.nextInt();
        System.out.println("Enter the exponent:");
        exponent=scan.nextInt();

        for(int i=1;i<=exponent;i++)
        {
            result *= base;

        }
        System.out.println("Result:"+result);

    }
}