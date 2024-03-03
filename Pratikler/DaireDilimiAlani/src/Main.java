import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a, pi = 3.14, alan, dilimAlan;


        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapı kaç olsun?");
        r = scan.nextDouble();
        System.out.println("Daire diliminin merkez açısının ölçüsü kaç olsun?");
        a = scan.nextDouble();

        alan = pi * r * r;
        dilimAlan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin alanı:" + alan);
        System.out.println("Daire diliminin alanı:" + dilimAlan);


    }
}