package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import java.util.Arrays;

public class Primzahlen {

    public static int[] primsErathostenes(int max) {
        boolean[] sieb = new boolean[max + 1];
        int count=0;
        // Werte ab 2 nicht durchgestrichen an die Tafel geschrieben
        for (int i=2; i<=max; i++) sieb[i] = true;
        // sieben
        for (int i=2; i<=max; i++) {
            if (sieb[i]){
                // Primzahl!
                count++;
                for (int j=2*i;j<=max; j+=i) sieb[j] = false;
            }
        }
        // Herraussuchen der Lösung
        int[] result = new int[count];
        count=0;
        for (int i=2; i<=max; i++) {
            if (sieb[i]){
                result[count]=i;
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int max=100;
        int[] p = primsErathostenes(max);
        System.out.println("Primzahlen: "+ Arrays.toString(p));
    }
}
