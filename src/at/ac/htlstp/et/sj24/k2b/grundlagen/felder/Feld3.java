package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import java.util.Arrays;

public class Feld3 {

    /**
     * Fügt an der Stelle pos den Wert value im Feld f ein<br>
     * Das Originalfeld soll dabei erhalten bleiben
     * @param f      Feld
     * @param pos    Position
     * @param value  Wert
     * @return       neues Feld mit eingefügtem Wert
     */
    public static double[] insert(double[] f, int pos, double value) {
        double[] result = new double[f.length + 1];
        for (int i = 0; i < f.length; i++) {
            if (i<pos) result[i]   = f[i];
            else       result[i+1] = f[i];
        }
        result[pos] = value;
        return result;
    }

    public static double[] remove(double[] f, int pos) {
        double[] result = new double[f.length - 1];
        for (int i = 0; i < f.length; i++) {
            if (i<pos)      result[i]   = f[i];
            else if (i>pos) result[i-1] = f[i];
        }
        return result;
    }

    public static double[] reverse(double[] f) {
        return f;
    }

    public static void main(String[] args) {
        double[] x = {2,6,3,7,4};
        double[] y;
        y = insert(x, 2, 14.3);
        x[1]=13;
        System.out.println("x: " + Arrays.toString(x) + "\ny: " + Arrays.toString(y));
        y = remove(x, 1);
        System.out.println("x: " + Arrays.toString(x) + "\ny: " + Arrays.toString(y));
    }
}
