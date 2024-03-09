import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz : ");
        int heat = scan.nextInt();

        if (heat > 5) {

            if (heat < 15) {

                System.out.println("Sinemaya gidebilirsiniz.");

            } else if (heat <= 25) {

                System.out.println("Pikniğe gidebilirsiniz.");


            } else {

                System.out.println("Yüzmeye gidebilirsiniz.");
            }

        } else {

            System.out.println("Kayak yapabilirsiniz.");
        }
    }
}