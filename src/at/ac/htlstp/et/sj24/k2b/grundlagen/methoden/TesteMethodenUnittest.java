package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteMethodenUnittest {

    @Test
    public void test1() {
        assertEquals(9,BerechnungsMethoden.ziffernsumme(9));
        assertEquals(9,BerechnungsMethoden.ziffernsumme(1008));
        assertEquals(10,BerechnungsMethoden.ziffernsumme(109));
    }
}
