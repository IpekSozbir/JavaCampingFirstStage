package day04;

public class C06_Operators {

    public static void main(String[] args) {

        // Atama operatoru =
        int a = 3;

        //  Scanner scan = new Scanner(System.in);
        //  int b = scan.nextInt();
        // b icin atama yapilmasi isteniyor

        int c = a; // bu islemde a c'ye esittir denilemez, c'ye a'nin degeri atama yapilmistir

        // Esitlik operatoru ==

        int d= 12;
        int e = 24;
        int f = 9+3;
        String m ="12";
        //  System.out.println(m==d); data turu ayni degilse esit denilemez

        System.out.println(d==e); // burada d ile e degerinin esit olup olmadıgı kontrol edilir
        // false yazdirir

        System.out.println(d==f); // true

        // Degildir operatoru !
        System.out.println(d!=e); // burada ise d e'ye esit degildir sorgulamasi yaptik
        // true yazdirir

        System.out.println(d!=f); // false

        String s1 = "Ali";
        String s2= "Ali";
        System.out.println(s1==s2); // true
        String s3 = "A"+"l"+"i";
        System.out.println(s1==s3); // true
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;
        System.out.println("s6 = " + s6);
        System.out.println("s1 = " + s1);
        System.out.println(s1==s6); // false Ali ile s4+s5 ayni sey degil icerigi ayni olsa da

        // Simdilik String iki degeri karsilastirmak icin == operatoru kullanilmaz
        // Iki metinsel ifadeyi karsilastirmak icin equals() metodu kullanacagiz
        System.out.println("--------equals () sonrası-----------");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s6)); // true

        System.out.println("--------Karsilastirma Operatorleri-----------");

        // Karsilastirma operatorleri

        int x = 15;
        int y = 20;
        int z = y-x+10; // 15
        int r = y-5;

        System.out.println(x<y); // true
        System.out.println(x>y); // false
        System.out.println(x<=z); // true
        System.out.println(z<y); // true
        System.out.println(y>=x); // true
        System.out.println(!(x<y)); // false

        System.out.println("--------Mnatiksal Operatorler-----------");
        // Mantiksal Operatorler

        // (AND) ve operatoru &&
        System.out.println(x<y && z<y && r<y);
        // Burada ve kullanildigi icin sorgulanan sartlarin tamami dogru ise true olur
        // sorgulanan sartlardan biri yanlis ise false olur

        System.out.println(x<y && z<y && r==y); // false

        // (OR) veya operatoru ||

        System.out.println(x<y || z<y || r==y); // true
        // veya operatorunde sorgulanan sartlardan en az bir tanesinin dogru olmasi true verdirir
        // false verebilmesi icin tum kosullarin yanlis olmasi gerekir

        System.out.println(x==y || z>y || r>y); // false




    }
}
