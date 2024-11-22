package day02;

import java.util.Scanner;

public class C05_CemberinCevresiVeAlaniniHesaplama {

    public static void main(String[] args) {

        // Soru : Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.
        // cevre = 2 * PI * yaricap    alan = PI * yaricap * yaricap

        Scanner scan = new Scanner(System.in);

        System.out.println("Cemberin Yari Capini Giriniz");
        double yaricap = scan.nextDouble();


        System.out.println( "Cemberin cevresi :" + (2 * 3.14 * yaricap));
        System.out.println( "Dairenin alani");

    }

}
