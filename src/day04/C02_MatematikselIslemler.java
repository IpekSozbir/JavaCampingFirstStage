package day04;

import java.util.Scanner;

public class C02_MatematikselIslemler {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz : ");
        int sayi= scan.nextInt();
        System.out.println("Girmis oldugunuz sayi : " + sayi ); //4586

        int birlerBasamagi = sayi%10; // 6
        System.out.println("Birler Basamagi : " + birlerBasamagi);
        sayi = sayi/10; //sayi: 458

        int onlarBasamagi = sayi%10; // 8
        System.out.println("Onlar Basamagi : " + onlarBasamagi);
        sayi = sayi/10; // sayi: 45

        int yuzlerBasamagi = sayi%10; // 5
        System.out.println("Yuzler Basamagi : " + yuzlerBasamagi);
        int binlerBasamagi = sayi/10;

        // int rakamlarToplami = binlerBasamagi + yuzlerBasamagi + onlarBasamagi + birlerBasamagi;
        // System.out.println("Girilen Rakamlar Toplami :" + rakamlarToplami);
        //daha kisa yolla yaparsak
        System.out.println("Girilen Sayinin Rakamlari Toplami : " + (binlerBasamagi + yuzlerBasamagi + onlarBasamagi + birlerBasamagi));


    }
}
