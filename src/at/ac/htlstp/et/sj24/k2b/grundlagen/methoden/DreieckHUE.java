package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreieckHUE {

    public static double a,b,c;

    public static void sort() {
        double h;
        if (a > b) { h=a; a=b; b=h; }
        if (a > c) { h=a; a=c; c=h; }
        if (b > c) { h=b; b=c; c=h; }
    }
    
    public static String bestimmeDreieck(double a, double b, double c) {
        return "kein";
    }

    public static void main(String[] args) {

    }

}
