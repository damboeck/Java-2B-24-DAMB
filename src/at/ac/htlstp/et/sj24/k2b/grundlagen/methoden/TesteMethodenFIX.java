package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

public class TesteMethodenFIX {

    public static void main(String[] args) {
        int a,e;
        a=109;
        e=BerechnungsMethoden.ziffernsumme(a);
        System.out.printf("Ziffernsumme von %d ist %d\n",a,e);

        a=1008;
        e=BerechnungsMethoden.ziffernsumme(a);
        System.out.printf("Ziffernsumme von %d ist %d\n",a,e);

        a=9;
        e=BerechnungsMethoden.ziffernsumme(a);
        System.out.printf("Ziffernsumme von %d ist %d\n",a,e);

    }
}
