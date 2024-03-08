import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double armutKg=2.14,elmaKg=3.67,domatesKg=1.11,muzKg=0.95,patlicanKg=5;
        double toplam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Armut kaç kilo? :");
        armut=scan.nextDouble() * armutKg;
        System.out.println("Elma kaç kilo? :");
        elma=scan.nextDouble() * elmaKg;
        System.out.println("Domates kaç kilo? :");
        domates=scan.nextDouble() * domatesKg;
        System.out.println("Muz kaç kilo? :");
        muz=scan.nextDouble() * muzKg;
        System.out.println("Patlıcan kaç kilo? :");
        patlican=scan.nextDouble() * patlicanKg;

        toplam = (armut + elma  + domates + muz + patlican);
        System.out.println("Toplam tutar:"+toplam+"TL'dir");



    }
}