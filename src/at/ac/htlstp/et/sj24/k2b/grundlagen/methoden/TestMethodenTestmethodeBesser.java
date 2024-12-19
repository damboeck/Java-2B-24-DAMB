package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

public class TestMethodenTestmethodeBesser {

    public static void teste(int a, int korrekt) {
        int e;
        e=BerechnungsMethoden.ziffernsumme(a);
        if (e != korrekt)
            System.out.printf("Ziffernsumme von %d ist %d statt %d\n",a,e,korrekt);
    }

    public static void main(String[] args) {
        teste(1008, 9);
        teste(109, 10);
        teste(9,9);
        System.out.println("Alle Tests fertig!");
    }
}
