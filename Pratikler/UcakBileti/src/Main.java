import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mesafe, yas, yolculukTuru;
        double normalTutar, mesafeBasinaUcret = 0.10, yasIndirimi, yasIndirimOrani = 0, gidisDonusIndirimi,
                gidisDonusIndirimOrani = 0.20, indirimliTutar, toplamTutar = 0;

        System.out.println("Gidilecek mesafeyi KM cinsinden giriniz: ");
        mesafe = scan.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas = scan.nextInt();

        System.out.println("Yolculuk türünü giriniz(1=>Tek yön, 2=>Gidiş Dönüş): ");
        yolculukTuru = scan.nextInt();

        if (yas < 12) {
            yasIndirimOrani = 0.5;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimOrani = 0.1;
        } else if (yas > 65) {
            yasIndirimOrani = 0.3;
        } else {
            yasIndirimOrani = 0;


            normalTutar = (mesafe * mesafeBasinaUcret);
            yasIndirimi = (normalTutar * yasIndirimOrani);
            indirimliTutar = (normalTutar - yasIndirimi);
            gidisDonusIndirimi = (indirimliTutar * gidisDonusIndirimOrani);

            if (mesafe > 0 && yas > 0) {
                if (yolculukTuru == 1) {
                    toplamTutar = indirimliTutar;
                    System.out.println("Toplam Tutar: " + toplamTutar);

                } else if (yolculukTuru == 2) {
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    System.out.println("Toplam Tutar: " + toplamTutar);
                }

            } else {
                System.out.println("Hatalı Veri Girdiniz !");

            }


        }
    }
}