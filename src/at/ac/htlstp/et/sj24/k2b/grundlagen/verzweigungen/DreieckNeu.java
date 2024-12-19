package at.ac.htlstp.et.sj24.k2b.grundlagen.verzweigungen;

import at.ac.htlstp.et.sj24.k2b.grundlagen.methoden.BerechnungsMethoden;

import java.util.Scanner;

public class DreieckNeu {

    /** Seiten des Dreiecks als globale Variable */
    public static double a,b,c;

    public static void eingabeSeiten() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Seite = ");
        a=sc.nextDouble();
        System.out.println("2. Seite = ");
        b=sc.nextDouble();
        System.out.println("3. Seite = ");
        c=sc.nextDouble();
        sc.close();
    }

    public static void sortiereSeiten() {
        double h;
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
    }

    public static void bestimmeDreieck(double a, double b, double c) {
        if      (a+b<=c)    System.out.println("kein Dreieck!");
        else if (BerechnungsMethoden.equals(a,c,0.1,false))      System.out.println("gleichseitiges Dreieck!");
        //TODO ....
    }

    public static void main(String[] args) {
        //Seiten einlesen
        eingabeSeiten();

        //Seiten sortieren
        sortiereSeiten();

        //TODO Bestimmen des Dreiecks
        System.out.println("a="+a+" b="+b+" c="+c);
        bestimmeDreieck(2,3,4);

    }
}
