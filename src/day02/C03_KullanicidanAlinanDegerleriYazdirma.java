package day02;

import java.util.Scanner;

public class C03_KullanicidanAlinanDegerleriYazdirma {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi Giriniz");
        String girilenIsim = scan.nextLine();

        // String girilenIsim1= scan.next(); //bu ilk space'e kadar olan kismi alir
        // String girilenIsim= scan.nextLine(); //butun satiri alir

        System.out.println("Soyisminizi Giriniz");
        String girilenSoyisim = scan.nextLine();

        System.out.println("Yasinizi Giriniz");
        int girilenYas = scan.nextInt();

       /* System.out.println("Isminiz: " + girilenIsim);
        System.out.println("Soyisminiz: " + girilenSoyisim);
        System.out.println("Yasiniz: " + girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir"); */ //böyle de olur

        System.out.println(
                "Isminiz : " + girilenIsim +
                        "\nSoyisminiz :" + girilenSoyisim +
                        "\nYasiniz : " + girilenYas +
                        "\nKaydiniz basariyla tamamlanmistir"
        );














    }

}
