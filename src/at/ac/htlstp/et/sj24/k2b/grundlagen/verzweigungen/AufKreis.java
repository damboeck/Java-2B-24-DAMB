package at.ac.htlstp.et.sj24.k2b.grundlagen.verzweigungen;

import java.util.Scanner;

public class AufKreis {

    /** Genauigkeit für den double-Vergleich als absoluter Genauigkeitswert */
    public static double S = 0.01;
    /** Genauigkeit für den double-Vergleich als relativer Genauigkeitswert in Prozent */
    public static double Rp = 0.1;

    public static void main(String[] args) {
        double mx = 3, my = 2, r=1.8;
        double px,py;
        double a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Px = ");
        px = sc.nextDouble();
        System.out.print("Py = ");
        py = sc.nextDouble();

        a = Math.sqrt(Math.pow(px-mx, 2) + Math.pow(py-my, 2));

        //if (Math.abs(a-r)<S) System.out.println("Auf dem Kreis!");
        if (Math.abs(a-r)*100/Math.max(Math.abs(a),Math.abs(r))<Rp) System.out.println("Auf dem Kreis!");
        else      System.out.println("daneben!");

    }

}
