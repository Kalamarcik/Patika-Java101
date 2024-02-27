import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar = scan.nextInt();

        boolean oranKac = tutar > 0 && tutar <= 1000;
        kdvOran = oranKac ? 0.18 : 0.08;

        kdvTutar = kdvOran * tutar;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar:" + tutar);
        System.out.println("KDV oranı:" + kdvOran);
        System.out.println("KDV tutarı:" + kdvTutar);
        System.out.println("KDV'li tutar:" + kdvliTutar);

    }
}