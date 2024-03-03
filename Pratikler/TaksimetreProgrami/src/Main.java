import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmUcreti = 2.20, tutar, odenecekTutar;
        int acilis = 10, gidilenKm;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kilometre gidileceğini giriniz:");
        gidilenKm = scan.nextInt();

        tutar = (acilis + (kmUcreti * gidilenKm));

        // tutar= (tutar<20) ? 20 : tutar; şeklinde de yapılabilir
        boolean minimum = tutar >= 20;
        odenecekTutar = minimum ? tutar : 20;

        System.out.println("Ödenecek tutar:" + odenecekTutar);


    }
}