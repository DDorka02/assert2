package assertgyak;

public class Teszt {

    static void assertKVegNagyobb() {
        tesztnagyobb1();
        tesztnagyobb2();
        tesztnagyobb3();
        tesztnagyobb4();
        tesztnagyobb5();
    }

    private static void tesztnagyobb5() {
        int kapott;
        int vart;
        int k = 0;
        int min= 14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 20;
        assert vart == kapott:" Nem működik: k nulla";
    }

    private static void tesztnagyobb4() {
        int kapott;
        int vart;
        int k = 5;
        int min= -14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = -5;
        assert vart == kapott:" Nem működik: negatív a min értéke";
    }

    private static void tesztnagyobb3() {
        int kapott;
        int vart;
        int k = 4;
        int min= 14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 24;
        assert vart == kapott:" Nem működik: min utolsó számjegye egyenlő a k";
    }

    private static void tesztnagyobb2() {
        int kapott;
        int vart;
        int k = 4;
        int min= 18;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 24;
        assert vart == kapott:" Nem működik: min utolsó számjegye nagyobb mint a k";
    }

    private static void tesztnagyobb1() {
        int kapott;
        int vart;
        int k = 4;
        int min= 13;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 14;
        assert vart == kapott:" Nem működik: min utolsó számjegye kisebb mint a k";
    }

    static void assertszomszedPrimE() {
        tesztszomszed1();
        tesztszomszed2();
        tesztszomszed3();
        tesztszomszed4();
        tesztszomszed5();
    }

    private static void tesztszomszed1() {
        int szam =8;
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        boolean vart = true;
        assert vart == kapott: "kisebb primet ne találja nem működik";   
    }
    
    private static void tesztszomszed2() {
        int szam =7;
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        boolean vart = false;
        assert vart == kapott: "7-ra nem működik";   
    }
    
    private static void tesztszomszed3() {
        int szam =0;
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        boolean vart = false;
        assert vart == kapott: "0-ra nem működik";
    }
    
    private static void tesztszomszed4() {
        int szam =10;
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        boolean vart = true;
        assert vart == kapott: "nagyobb primet ne találja nem működik";  
    }
    
    private static void tesztszomszed5() {
        int szam =-6;
        boolean kapott = Fuggvenyek.szomszedPrimE(szam);
        boolean vart = false;
        assert vart == kapott: "negatív nem működik";
    }
    public static void assertkVegVanE() {

    }

    static void assertutolsoKetjegyu() {
//        tesztutolsoket1();
//        tesztutolsoket2();
//        tesztutolsoket3();
//        tesztutolsoket4();
//        tesztutolsoket5();
    }

//    private static void tesztutolsoket5() {
//        int k = 5;
//        int min= 17;
//        int max= 10;
//        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
//        int vart = 0;
//        assert vart == kapott:"Nem működik: Nincs ilyen az intervallumba";
//    }
//
//    private static void tesztutolsoket4() {
//        int k = 5;
//        int min= 7;
//        int max= 10;
//        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
//        int vart = 0;
//        assert vart == kapott:"Nem működik: Nincs ilyen az intervallumba";  
//    }

//    private static void tesztutolsoket3() {
//        int k = 5;
//        int min= 7;
//        int max= 15;
//        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
//        int vart = 15;
//        assert vart == kapott:"Nem működik: Hátul van ilyen az intervallumba";
//    }
//
//    private static void tesztutolsoket2() {
//        int k = 4;
//        int min= 14;
//        int max= 25;
//        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
//        int vart = 14;
//        assert vart == kapott:"Nem működik: Elöl van ilyen az intervallumba";       
//    }
//
//    private static void tesztutolsoket1() {
//        int k = 4;
//        int min= 13;
//        int max= 25;
//        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
//        int vart = 14;
//        assert vart == kapott:"Nem működik: Középen van ilyen az intervallumba";
//    }

    static void assertprimNagyobb() {
        tesztprimnagyobb1();
        tesztprimnagyobb2();
        tesztprimnagyobb3();
        tesztprimnagyobb4();
        tesztprimnagyobb5();
    }

    private static void tesztprimnagyobb1() {
        int k =8;
        int kapott = Fuggvenyek.primNagyobb(k);
        int vart = 11;
        assert vart == kapott: "pozitív szám esetében nem találja";
    }
    private static void tesztprimnagyobb2() {
        int k =1;
        int kapott = Fuggvenyek.primNagyobb(k);
        int vart = 2;
        assert vart == kapott: "1 esetében nem találja";
    }
    private static void tesztprimnagyobb3() {
        int k = 0;
        int kapott = Fuggvenyek.primNagyobb(k);
        int vart = 2;
        assert vart == kapott: "0 esetében nem találja";
    }
    private static void tesztprimnagyobb4() {
        int k = -580;
        int kapott = Fuggvenyek.primNagyobb(k);
        int vart = 2;
        assert vart == kapott: "negatív esetében nem találja";
    }
    private static void tesztprimnagyobb5() {
        int k = 7;
        int kapott = Fuggvenyek.primNagyobb(k);
        int vart = 11;
        assert vart == kapott: "k prím esetében nem találja";
    }



    
    
}
