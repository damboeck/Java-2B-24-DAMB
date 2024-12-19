package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreieckHUE {

    public static int a,b,c;
    public static void sort() {
        int h;
        if (a > b) { h=a; a=b; b=h; }
        if (a > c) { h=a; a=c; c=h; }
        if (b > c) { h=b; b=c; c=h; }
    }

    public static void testeSort(int a1,int b1,int c1,int a2,int b2,int c2) {
        a=a1; b=b1; c=c1;
        sort();
        assertEquals(a2,a);
        assertEquals(b2,b);
        assertEquals(c2,c);
    }

    @Test
    public void testSort() {
        testeSort(2,4,3,2,3,4);
        testeSort(3,2,4,2,3,4);
        testeSort(4,2,3,2,3,4);
        testeSort(4,3,2,2,3,4);
        testeSort(2,3,4,2,3,4);
        testeSort(3,4,2,2,3,4);
        testeSort(3,4,3,3,3,4);
        testeSort(4,3,3,3,3,4);
    }
}
