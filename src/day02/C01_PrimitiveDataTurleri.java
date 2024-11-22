package day02;

public class C01_PrimitiveDataTurleri {

    public static void main(String[] args) {

        boolean gozlukluMu = true;
        boolean emekliMi = false;
        // boolean saliMi = "true"; // "" kullanilmaz
        //  boolean evliMi = 'false'; // Too many characters in character literal

        char chr1 = 'a';
        char chr2 = '5';
        char chr3 = '#';
        // char chr4 = "y";
        char chr5 = ' '; // space de bir karakterdir
        // char chr6 = 'ab' // Too many characters in character literal
        //  char chr7 = 'a '; Too many characters in character literal


        // lisedeki ogrencilerin yaslarini tutan bir variable dusunelim
        byte yas1 = 17; // hafizada 8 bit yer kaplar
        short yas2 = 15; // hafizada 16 bit yer kaplar
        int yas3 = 16; // hafizada 32 bit yer kaplar
        long yas4 = 16; // hafizada 64 bit yer kaplar

        // primitive data turleri barindirdiklari degere gore degil
        // data turune gore hafizada yer kaplarlar

        int sayi1 = 1; //hafizada 32 bit yer kaplar
        int sayi2 = 100; //hafizada 32 bit yer kaplar
        int sayi3 = 10000; // hafizada 32 bit yer kaplar
        int sayi4 = 100000000; // hafizada 32 bit yer kaplar

        double sayi6= 24.8;
        float sayi7 = 32.7f;
        float sayi8 = 45.9F;

        float flt1 = 20f;
        float flt2 = 6;

        System.out.println( flt1 / flt2 ); // 20/6 =3,333333333

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println( dbl1 / dbl2 ); // 3,333333333333333333

        // UYARI : double sayilari ustel olarak tuttugu icin
        // virgulden sonra ilerleyen basamaklarda hata olabilir

    }

}
