package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

public class TestMethodenTestmethode {

    public static void teste(int a) {
        int e;
        e=BerechnungsMethoden.ziffernsumme(a);
        System.out.printf("Ziffernsumme von %d ist %d\n",a,e);
    }

    public static void main(String[] args) {
        teste(1008);
        teste(109);
        teste(9);
    }
}
