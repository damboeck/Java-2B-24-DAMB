package at.ac.htlstp.et.sj24.k2b.grundlagen.schleifen;

public class Christbaum {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        for (int z=1; z<=SIZE; z++) {
            for (int lz=1; lz<=SIZE-z; lz++) {
                System.out.print(" ");
            }
            for (int st=1;st<=2*z-1;st++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //STAMM
        for (int i=1;i<=2;i++) {
            for (int lz=1;lz<=SIZE-1;lz++) System.out.print(" ");
            System.out.println("*");
        }
    }
}
