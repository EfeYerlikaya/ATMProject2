import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int bakiye = 1000;
        int input ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Merhabalar Hoşgeldiniz.");
        System.out.println("Güncrl bakiyeniz :" + bakiye + "TL");

        while (bakiye > 0){

            System.out.println();
            System.out.println("1) Para yatır");
            System.out.println("2) Para çek");
            System.out.println("3) Bakiye Sorgula ");
            System.out.println("4) Çıkış yap");
            System.out.print("Yapmak istegiğiniz işlemi seçiniz");
            input = sc.nextInt();

        }
        System.out.println("Tekrar Bekleriz.");

    }
}