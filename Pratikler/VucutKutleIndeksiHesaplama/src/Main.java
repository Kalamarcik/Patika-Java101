import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo = scan.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz:" + indeks);

    }
}