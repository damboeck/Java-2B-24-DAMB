package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import java.util.Arrays;

public class Feld2 {

    public static void m1(double y) {
        y=33;
    }

    public static void m2(double[] f) {
        f[1]=77;
    }

    public static double[] m3(double[] f) {
        return new double[] {f[0],5,f[2]};
    }

    public static void main(String[] args) {
        double[] R={4,7,9,12,3};
        double   x=14;
        m1(x);
        m2(R);
        System.out.println(x);
        System.out.println("R:"+ Arrays.toString(R));
        R=m3(R);
        System.out.println(Arrays.toString(R));
    }
}
