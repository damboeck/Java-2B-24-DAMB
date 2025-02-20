package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import java.util.ArrayList;

public class PrimzahlenCollection {

    public static ArrayList<Integer> primsErathostenes(int max) {
        boolean[] sieb = new boolean[max + 1];
        ArrayList<Integer> result = new ArrayList<>();
        // Werte ab 2 nicht durchgestrichen an die Tafel geschrieben
        for (int i=2; i<=max; i++) sieb[i] = true;
        // sieben
        for (int i=2; i<=max; i++) {
            if (sieb[i]){
                // Primzahl!
                result.add(i);
                for (int j=2*i;j<=max; j+=i) sieb[j] = false;
            }
        }
        return result;
    }

    public static ArrayList<Integer> prims(int max) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=2; i<=max; i++) {
            boolean isprime=true;
            for (int j=0; j<result.size(); j++) {
                if (i%result.get(j)==0) isprime=false;
            }
            if (isprime) result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int max=1000;
        long start = System.currentTimeMillis();
        ArrayList<Integer> p = primsErathostenes(max);
        long ee    = System.currentTimeMillis();
        ArrayList<Integer> p2= prims(max);
        long end   = System.currentTimeMillis();
        System.out.println("Erathostenes: "+(ee-start)+" ms");
        System.out.println("Variant     : "+(end-ee)+" ms");
        System.out.println("Primzahlen Erathostenes: "+ p);
        System.out.println("Primzahlen Variante    : "+ p2);
        //Check
        if (p.size()!=p2.size()) System.out.println("Primzahlen SIZE variantes different");
        else {
            boolean ok=true;
            for (int i=0; i<p.size(); i++) {
                int x = p.get(i);
                int y = p2.get(i);
                if (x!=y) {
                    System.out.println(p.get(i)+" != "+p2.get(i));
                    ok=false;
                }
            }
            if (!ok) System.out.println("Primzahlen variantes different");
            else System.out.println("SUPER!");
        }
    }
}
