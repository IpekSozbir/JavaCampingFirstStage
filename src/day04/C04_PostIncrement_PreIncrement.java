package day04;

public class C04_PostIncrement_PreIncrement {

    public static void main(String[] args) {

        int a = 30;
        int b = 50;

        int x = 40;
        int y = 60;

        System.out.println(x++); // 40
        System.out.println(x); // 41

        System.out.println(++y); // 61
        System.out.println(y); // 61


        //a++; // a degerinin bir arttirilmasi demek [ a=a+1]
        // Burada once a degerini alir sonra 1 arttirir
        // Bu olaya post-increment denir

        //System.out.println("a = " + a); // 31

        // ++a;
        // Burada a degeri once arttirilir sonra kullanilir
        // Bu olaya pre-increment denir
        //System.out.println("a = " + a); // 32



        // post-increment [ once kullan sonra arttir]
        int c = a++; // burada once c degiskenine a degerini atadı sonra a degiskenini arttirdi
        System.out.println("c = " + c); // c =  30
        System.out.println("a = " + a); // a = 31

        // pre-increment [ once arttir sonra kullan]
        int d = ++b; // once b degerini arttirdi sonra bu yeni degeri d degiskenimne atadi
        System.out.println("d = " + d); // d = 51
        System.out.println("b = " + b); // b = 51

        int e = c--;
        System.out.println("e = " + e); // e = 30
        System.out.println("c = " + c); // c = 29

        int f = --d;
        System.out.println("f = " + f); // f = 50
        System.out.println("d = " + d); // d = 50

    }
}
