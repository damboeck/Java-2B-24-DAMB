package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

public class BerechnungsMethoden {

    /**
     * Berechnet die Ziffernsumme einer Zahl
     * @param x   Zahl mit maximal 4 Ziffern
     * @return    Ziffernsumme von x
     */
    public static int ziffernsumme(int x) {
        int result = 0;
        result += x%10;
        result += x/10%10;
        result += x/100%10;
        result += x/1000%10;
        return result;
    }

    /**
     * Vergleicht x mit y
     * @param x           erster Wert
     * @param y           zweiter Wert
     * @param tolerance   Toleranz entweder absolut als Wert oder relativ als Prozentwert
     * @param absolut     absolute (true) oder relative(false) Toleranz
     * @return            true wenn ungefähr gleich
     */
    public static boolean equals(double x, double y,double tolerance,boolean absolut) {
        if (absolut) {
            return Math.abs(x-y)<=Math.abs(tolerance);
        } else {
            return Math.abs(x-y)/Math.max(Math.abs(x),Math.abs(y))*100d<=tolerance;
        }
    }

}
