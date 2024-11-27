package day04;

public class C03_Concatenation {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";
        String str3 = " ";
        String str4 = "";

        int a = 2;
        int b = 3;

        System.out.println(str1+str2+str3+str4+a+b); // JavaCandir 23

        System.out.println(str1+str2+str3+str4+(a+b)); // JavaCandir 5

        // Bir kac variable System.out.println ile yazdirilmak istenilince concatenation yapilir
        // Bu islem matematiksel islem onceligine dikkat etmek sartiyla
        // String bir deger var ise string diger degerleri string'e cevirerek concat eder
        // hiclik mesela burada String'e cevirmede kullanilir

        int TCKN = 1111111111;
        System.out.println(TCKN+str4); // 1111111111

        System.out.println(a+b+str3+str1+str3+str2+str3); // 5 Java Candir

        System.out.println(a*b+str2+str4); // 6Candir

    }
}
