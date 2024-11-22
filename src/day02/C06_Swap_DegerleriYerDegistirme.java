package day02;

import java.util.Scanner;

public class C06_Swap_DegerleriYerDegistirme {

    public static void main(String[] args) {

        // Soru : (Interview sorusu) Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 1.sayiyi giriniz...");
        int sayi1 = scan.nextInt(); //15

        System.out.println("Lutfen 2.sayiyi giriniz...");
        int sayi2 = scan.nextInt(); //25

        // sayi1 ve sayi2'nin degerlerini degistirebilmek icin
        // once yedek bir variable olusturuyoruz

        // olusturdugumuz bos yedek variable'a sayi2 degerini atayip
        // sayi2 variable'ina ise sayi1'in degerini atiyoruz
        // boylece sayi2'nin degerini sayi1'in degeriyle degistirmis
        // aynı zamanda sayi2'nin ilk degerinin kaybolmasini engellemis oluyoruz
        // daha sonra yedek variable'i icinde bulunan sayi2 degerini sayi1'e atayarak
        // swap islemini tamamliyoruz

        int yedek = sayi2;

        sayi2 = sayi1;

        sayi1 = yedek;



        System.out.println("Sayi1'in yeni degeri: " + sayi1 ); //25
        System.out.println("Sayi2'nin yeni degeri : " + sayi2 ); //15



    }

}
