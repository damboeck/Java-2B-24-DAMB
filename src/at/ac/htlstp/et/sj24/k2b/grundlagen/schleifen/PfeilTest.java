package at.ac.htlstp.et.sj24.k2b.grundlagen.schleifen;

public class PfeilTest {

    public static void printLZ(int a) {
        for(int i = 0; i < a; i++)
            System.out.print(' ');
    }

    public static void pfeil(int size) {
        int sz = size/4;
        //TODO oberer Schenkel
        for (int i = 0; i < sz; i++) {
            printLZ(size-sz-1+i);
            System.out.println("\\");
        }
        //Linie
        for (int i = 1; i < size; i++) System.out.print("-");
        System.out.println(">");
        //TODO unterer Schenkel
        for (int i = 0; i < sz; i++) {
            printLZ(size-i-2);
            System.out.println("/");
        }
    }

    public static void main(String[] args) {
        pfeil(2);
        pfeil(4);
        pfeil(9);
        pfeil(22);
    }

}
