package assertgyak;

public class Fuggvenyek {

    static int kVegNagyobb(int k, int min) {
        min++;
        while (!(Math.abs(min%10) == k )){
            min++;
        }
        return min;
    }

    static boolean szomszedPrimE(int szam) {
        if (szam < 0){
            return false;
        }
        if(szam == 0){
            return false;
        }
        if (PrimE(szam -1)){
           return true; 
        }
        if (PrimE(szam + 1)){
           return true; 
        }
        return false;
    }

    private static boolean PrimE(int n) {
        boolean prim;
        if (n<2){
            prim = false;
        }
        else{
            int i = 2;
            while(i<=Math.sqrt(n)&&n%i!=0){
                i++;}
        
            prim = i > Math.sqrt(n);
        }
        return prim;
    }

//    static int utolsoKetjegyu(int k, int min, int max) {
//        
//        return 0;
//        
//    }

    static int primNagyobb(int k) {
        k++;
        while(!PrimE(k)){
            k++;
        }
        return k;
    }
  
}
 