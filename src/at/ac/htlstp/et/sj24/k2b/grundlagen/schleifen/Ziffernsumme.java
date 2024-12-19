package at.ac.htlstp.et.sj24.k2b.grundlagen.schleifen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ziffernsumme {

    public static int zs(int x) {
        int summe = 0;
        while(x!=0) {
            summe += x%10;
            x     /= 10;
        }
        return summe;
    }

    @Test
    public void test() {
        assertEquals(4,zs(13));
        assertEquals(4+8+5+7+3+7+4+9+0,zs(485737490));
        assertEquals(-4,zs(-13));
    }
}
