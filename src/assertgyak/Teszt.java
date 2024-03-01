package assertgyak;

public class Teszt {

    public static void assertKVegNagyobb() {
        int kapott;
        int vart;
//        1.eset
        int k = 4;
        int min= 13;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 14;
        assert vart == kapott:" Nem működik: min utolsó számjegye kisebb mint a k";
//        2. eset
        k = 4;
        min= 18;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 24;
        assert vart == kapott:" Nem működik: min utolsó számjegye nagyobb mint a k";
//        3.eset
        k = 4;
        min= 14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 24;
        assert vart == kapott:" Nem működik: min utolsó számjegye egyenlő a k";
//        4.eset
        k = 5;
        min= -14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = -5;
        assert vart == kapott:" Nem működik: negatív a min értéke";
//        5.eset
        k = 0;
        min= 14;
        kapott= Fuggvenyek.kVegNagyobb(k,min);
        vart = 20;
        assert vart == kapott:" Nem működik: k nulla";
    }

    static void assertszomszedPrimE() {
        
    }

    public static void assertkVegVanE() {
        int [] kapott;
        int vart;
//        1.eset
        int k = 3;
        int min= 8;
        int max= 10;
        
        vart = 14;
//        assert vart == kapott:" Igaz";
//        2.eset
        k = 4;
        min= 13;
        max=20;
        
        vart = 14;
//        assert vart == kapott:" Hamis";

    }

    static void assertutolsoKetjegyu() {
//        1.eset
        int k = 4;
        int min= 13;
        int max= 25;
        int kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
        int vart = 14;
        assert vart == kapott:"Nem működik: Középen van ilyen az intervallumba";
//         2.eset
        k = 4;
        min= 14;
        max= 25;
        kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
        vart = 14;
        assert vart == kapott:"Nem működik: Elöl van ilyen az intervallumba";
//         3.eset
        k = 5;
        min= 7;
        max= 15;
        kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
        vart = 15;
        assert vart == kapott:"Nem működik: Hátul van ilyen az intervallumba";
//         4.eset
        k = 5;
        min= 7;
        max= 10;
        kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
        vart = 0;
        assert vart == kapott:"Nem működik: Nincs ilyen az intervallumba";
//         5.eset
        k = 5;
        min= 17;
        max= 10;
        kapott= Fuggvenyek.utolsoKetjegyu(k,min,max);
        vart = 0;
        assert vart == kapott:"Nem működik: Nincs ilyen az intervallumba";

    }

    static void assertprimNagyobb() {
        
    }
    
}
