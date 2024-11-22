package day02;

import java.util.Scanner;

public class C04_KullanicidanAlinanDegerleriYazdirma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        // Kaydiniz basarili sekilde olusturuldu

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi Giriniz");
        String girilenIsim = scan.nextLine();

        System.out.println("Soyisminizi Giriniz");
        String girilenSoyisim = scan.nextLine();

        System.out.println("Yasinizi Giriniz");
        int girilenYas = scan.nextInt();

        System.out.println(
                "girilen bilgiler: " + girilenIsim.charAt(0) +
                        " " + girilenSoyisim + ", " + girilenYas +
                        "\nKaydiniz basarili sekilde olusturuldu"

        );


    }

}
