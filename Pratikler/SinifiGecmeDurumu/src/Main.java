import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik;
        int gecersizDers = 0, toplamDers = 5;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = scan.nextDouble();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = scan.nextDouble();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = scan.nextDouble();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = scan.nextDouble();

        System.out.println("Müzik notunuzu giriniz:");
        muzik = scan.nextDouble();

        if (mat < 0 || mat > 100) {
            mat = 0;
            gecersizDers++;
        }

        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            gecersizDers++;
        }

        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            gecersizDers++;
        }

        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            gecersizDers++;
        }

        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            gecersizDers++;
        }

        double toplam = (mat + fizik + turkce + kimya + muzik);
        double ortalama = toplam / (toplamDers - gecersizDers);

        if (ortalama <= 55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız:"+ortalama);


    }
}