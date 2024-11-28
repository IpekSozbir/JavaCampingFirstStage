package day04;

public class C05_Increment {
    public static void main(String[] args) {


        int sayi = 20;
        System.out.println(sayi); // 20

        // sayi = sayi+3;
        sayi+=3; // sayinin degerini 3 arttirin ve yeni deger olarak sayi degiskenini degistirin
        System.out.println(sayi); // 23

        int ogrenciNo = 2025001;
        System.out.println("1.Ogrenci:" +ogrenciNo++); // 1. ogrenciye 2025001 degerini atar ve ogrenciNo degerini 2025002 yapar
        System.out.println("2.Ogrenci:" +ogrenciNo++); // 2. ogrenciye 2025002 degerini atar ve ogrenciNo degerini 2025003 yapar
        System.out.println("3.Ogrenci:" +ogrenciNo++); //3. ogrenciye 2025003 degerini atar ve ogrenciNo degerini 2025004 yapar
        System.out.println("4.Ogrenci:" +ogrenciNo++); // 4. ogrenciye 2025004 degerini atar ve ogrenciNo degerini 2025005 yapar

        System.out.println(ogrenciNo); // 2025005

        int kitapNo = 2025000;
        System.out.println("1.Ogrenci:" + (kitapNo+=5)); //2025005
        System.out.println("2.Ogrenci:" + (kitapNo+=5)); //2025010
        System.out.println("3.Ogrenci:" + (kitapNo+=5)); // 20205015
        System.out.println("4.Ogrenci:" + (kitapNo+=5)); // 2025020

        System.out.println(kitapNo); // 2025020

        int a = 50;
        a*=3; //a'nın yeni degeri 50*3=150 oldu
        System.out.println("a = " + a);

        a/=5; // a'nin yeni degeri 150/5=30 oldu
        System.out.println("a = " + a);

        double c = 23.12;
        c = 5; // double integer degerleri kapsadigi icin sorun olmadi (c=c-5.0)
        System.out.println("c = " + c);

        int d = 128;
        d+= 10.35;
        System.out.println("d = " + d);


    }
}
