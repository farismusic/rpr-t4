package ba.unsa.etf.rpr.predavanje03;

public class Main {

    public static void main(String[] args){
        System.out.println("Proba");
        int[] niz = new int[10];
        for(int i=0; i<10; i++){
            niz[i] = i;
        }
        int[] niz2 = new int[10];
        for(int i=0; i<10; i++){
            niz2[i] = niz[i];
        }
        niz[9] = 6;
        System.out.println(niz2[9]);
    }
}
