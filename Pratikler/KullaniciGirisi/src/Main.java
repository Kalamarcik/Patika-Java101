import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        username = scan.nextLine();

        System.out.print("Şifreniz:");
        password = scan.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");

        } else if (((username.equals("patika"))) && (!(password.equals("java123")))) {
            System.out.println("Şifrenizi yanlış girdiniz.\nŞifrenizi sıfırlamak ister misiniz?\n E/H");
            String reset = scan.nextLine();

            if (reset.equals("E")) {
                System.out.println("Yeni şifrenizi giriniz:");
                String newPassword = scan.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newPassword = scan.nextLine();
                    if (!(newPassword.equals(password) || newPassword.equals("java123"))) {
                        System.out.println("Şifre oluşturuldu");

                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        newPassword = scan.nextLine();

                    }
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }


            }
        } else if (!(username.equals("patika"))) {
            System.out.println("Kullanıcı adınızı yanlış girdiniz");
        }


    }
}