package day03;

public class C03_ExplicitNarrowing {

    public static void main(String[] args) {

        /*
       Explicit Narrowing yaptigimizda
       daha kapsamli bir degeri daha kucuk kapsamli bir variable'a atama yapiyoruz

       deger variable'nin sinirlari icindeyse
       Explicit Narrowing yaptigimizda ayni degere sahip olur

       ANCAAAAK eger deger variable'nin sinirlarindan buyuk ise
       bu durumda deger farkli bir sonuca donusebilir
         */


        int sayi1 = 43;
        int sayi2 = 130;
        int sayi3 = 150;
        int sayi4 = 262;
        int sayi5 = 520;

        double dbl1 = 34.1;
        double dbl2 = 45.93;

        byte byt = 25;

        sayi1 = (int)dbl1;

        System.out.println("34.1'in int'a cast edilmis hali : " + sayi1);
        //34.1'in int'a cast edilmis hali : 34

        sayi1 = (int)dbl2;
        System.out.println("45.92'nin int'a cast edilmis hali : " + sayi1);
        // 45.92'nin int'a cast edilmis hali : 45

        sayi1 = 43;

        byt = (byte)sayi1;

        System.out.println("43'un byte'a cast edilmis hali : " + byt);
        // 43'un byte'a cast edilmis hali : 43

        byt = (byte)sayi2;
        System.out.println("130'un byte'a cast edilmis hali : " + byt);
        // 130'un byte'a cast edilmis hali : -126


        byt = (byte)sayi3;
        System.out.println("150'nin byte'a cast edilmis hali : " + byt);
        // 150'nin byte'a cast edilmis hali : -106

        byt = (byte)sayi4;
        System.out.println("262'nin byte'a cast edilmis hali : " + byt);
        // 262'nin byte'a cast edilmis hali : 6

        byt = (byte)sayi5;
        System.out.println("520'nin byte'a cast edilmis hali : " + byt);
        // 262'nin byte'a cast edilmis hali : 8


    }

}
