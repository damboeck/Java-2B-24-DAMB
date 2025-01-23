package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import java.util.Arrays;

public class Feld1 {

    public static void print(double[] f) {
        for (int i=0;i<f.length;i++)
            System.out.print(f[i]+((i==f.length-1)?"\n":","));
    }

    public static void main(String[] args) {
        double[] R = {3,12,0.5,1000,12};
        double[] C = new double[7];
        double[] L,G;
        double Rges;

        C[0] = R[1]+R[3];
        System.out.println("C0:"+C[0]);
        Rges=0;
        for (int i=0;i<R.length;i++)
            Rges += R[i];
        System.out.println("Rges:"+Rges);

        L=new double[3];
        // G={3,4,6,7};falsch!!
        G = new double[]{3,4,6,7};
        System.out.println("G1:"+G[1]);

        System.out.println("R:"+R);
        for (int i=0;i<R.length;i++)
            System.out.print(R[i]+((i==R.length-1)?"\n":","));
        print(R);
        print(C);

        System.out.println("R:"+ Arrays.toString(R));
    }
}
