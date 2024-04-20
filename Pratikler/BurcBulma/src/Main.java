import java.util.Scanner;


/*Burç Bulan Program
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ay, gun;
        String burc = " ";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Doğduğunuz ay :");
        ay = scan.nextInt();

        System.out.println("Doğduğunuz gün :");
        gun = scan.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Oğlak";
                    System.out.println("Burcunuz Oğlak");
                } else {
                    burc = "Kova";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }

            } else {
                isError = true;
            }

        }

        if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }

            } else {
                isError = true;
            }

        }

        if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }

            } else {
                isError = true;
            }

        }

        if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }

            } else {
                isError = true;
            }

        }


        if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }

            } else {
                isError = true;
            }

        }

        if (isError || ay > 12 || ay < 1) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }


    }
}

