package at.ac.htlstp.et.sj24.k2b.grundlagen;

import java.util.Scanner;

/**
 * Programm welches den Radius eines Kreises einliest
 * und dann Fläche und Umfang berechnet.
 */
public class Kreisberechnung {

    public static void main(String[] args) {
        // Deklarationen
        double r; // Radius des Kreises
        double flaeche, umfang;
        Scanner scanner = new Scanner(System.in);

        // Radius einlesen
        System.out.print("Gib einen Radius ein:");
        r=scanner.nextDouble();

        // Berechnung
        umfang = 2*r*Math.PI;
        flaeche = Math.pow(r,2)*Math.PI;

        // Ausgabe
        System.out.printf("U=%8.2f\nA=%8.2f\n", umfang, flaeche);
        System.out.println("U="+umfang);
        System.out.println("A="+flaeche);

        // Zusammenräumen
        scanner.close();
    }
}
