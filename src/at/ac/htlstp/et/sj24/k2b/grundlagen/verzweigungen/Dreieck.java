package at.ac.htlstp.et.sj24.k2b.grundlagen.verzweigungen;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        double a,b,c,h;
        Scanner sc = new Scanner(System.in);

        //TODO Werte einlesen
        System.out.println("1. Seite = ");
        a=sc.nextDouble();
        System.out.println("2. Seite = ");
        b=sc.nextDouble();
        System.out.println("3. Seite = ");
        c=sc.nextDouble();

        // Sortieren
        if (a>b) {
            h=a;
            a=b;
            b=h;
        }
        if (a>c) {
            h=a;
            a=c;
            c=h;
        }
        if (b>c) {
            h=b;
            b=c;
            c=h;
        }
        //Ausgabe
        System.out.printf("%f <= %f <= %f\n",a,b,c);

    }
}
