package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

import org.junit.jupiter.api.Test;
import static at.ac.htlstp.et.sj24.k2b.grundlagen.methoden.DreieckHUE.bestimmeDreieck;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDreieckHUE {

    public static void testeSort(double a1,double b1,double c1,double a2,double b2,double c2) {
        DreieckHUE.a=a1;
        DreieckHUE.b=b1;
        DreieckHUE.c=c1;

        DreieckHUE.sort();

        assertEquals(a2,DreieckHUE.a);
        assertEquals(b2,DreieckHUE.b);
        assertEquals(c2,DreieckHUE.c);
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

    @Test
    public void testBestimmeDreieck() {
        assertEquals("kein",bestimmeDreieck(2,4,12));
        assertEquals("rechtwinkeliges",bestimmeDreieck(3,4,5));
        assertEquals("gleichschenkeliges",bestimmeDreieck(3,3,4));
        assertEquals("gleichschenkeliges",bestimmeDreieck(3,4,4));
        assertEquals("gleichseitiges",bestimmeDreieck(2,2,2));
        assertEquals("allgemeines",bestimmeDreieck(2,3,3.2));
        assertEquals("gleichseitiges",bestimmeDreieck(1.99999999,2,2.000000001));
    }

}
