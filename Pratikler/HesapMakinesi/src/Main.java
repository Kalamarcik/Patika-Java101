import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("İki sayının toplamı:" + (n1 + n2));
                break;
            case 2:
                System.out.println("İki sayının farkı:" + (n1 - n2));
                break;
            case 3:
                System.out.println("İki sayının çarpımı:" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                } else {
                    System.out.println("İki sayının bölümü:" + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
        }


    }
}