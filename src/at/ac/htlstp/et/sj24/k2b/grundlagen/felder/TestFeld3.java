package at.ac.htlstp.et.sj24.k2b.grundlagen.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFeld3 {

    public void assertEqualsArray(double[] x, double[] y ){
        assertEquals(Arrays.toString(x),Arrays.toString(y));
    }

    @Test
    public void testInsert() {
        assertEqualsArray(new double[]{4,13,7,4,5},Feld3.insert(new double[]{4,7,4,5},1,13));

    }

    @Test
    public void testRemove() {
        assertEqualsArray(new double[]{4,4,5},Feld3.remove(new double[]{4,7,4,5},1));
        assertEqualsArray(new double[]{7,4,5},Feld3.remove(new double[]{4,7,4,5},0));
        assertEqualsArray(new double[]{4,7,4},Feld3.remove(new double[]{4,7,4,5},3));
    }

    @Test
    public void testReverse() {
        assertEqualsArray(new double[]{5,4,7,4},Feld3.reverse(new double[]{4,7,4,5}));
        assertEqualsArray(new double[]{7,4,1}  ,Feld3.reverse(new double[]{1,4,7}));
    }
}
