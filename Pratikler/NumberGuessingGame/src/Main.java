import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("Lütfen tahmininizi giriniz :");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                } else {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak:" + (5 - right));
                }continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğin sayı :" + number);
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + "sayısı, girdiğiniz sayıdan büyüktür.");

                } else{
                    System.out.println(selected + "sayısı, girdiğiniz sayıdan küçüktür.");
                }System.out.println("Kalan hak:" + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.println("Tahminleriniz:" + Arrays.toString(wrong));
            }
        }
    }
}