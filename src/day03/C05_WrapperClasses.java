package day03;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        int sayi = 20;

         /*
            primitive'lerin hazir method'lari olmaz
            Java primitive data turlerinin de bazi hazir method'lari kullanabilmeleri icin
            ayni isimlerde Wrapper Class'lar olusturmustur

            boolean - char      - byte - short - int     - long - float - double
            Boolean - Character - Byte - Short - Integer - Long - Float - Double
         */

        byte byt1 = 24;

        int sayi1 = byt1; // auto-wedining - otomatik genisletme

        short shr1 = (short)sayi1; //explicit narrowing - zorla daraltma

        int sayi2 = 45;
        Integer sayi3 = sayi2;

        Boolean bl1 = true;
        boolean bl2 = bl1;


        // sayi barindiran primitive data turleri arasinda casting mumkun
        // ayni isimdeki primitive ile wrapper class'lar arasinda da gecis mumkundur
        // ANCAAAKKKK farkli wrapper class'lari
        // ya da farkli isimdeki bir primitive ile wrapper class arasinda casting mumkun degildir

        Integer sayi4 = 45;

        // Double sayi6 = sayi4; // Double <== Integer
        // Integer'a Double'a auto wedining yapmaz

        int sayi7 = sayi4; // int <== Integer

        // short sayi8 = sayi4; // short <== Integer


    }

}
