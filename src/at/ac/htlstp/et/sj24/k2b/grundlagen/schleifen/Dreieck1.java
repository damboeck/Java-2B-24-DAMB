package at.ac.htlstp.et.sj24.k2b.grundlagen.schleifen;

public class Dreieck1 {

    /**
     * Zeichnet ein Dreieck auf den Bildschirm<br>
     * Für eine Größe von 4 sollte es so aussehen:<br>
     * ****<br>
     * ***<br>
     * **<br>
     * *<br>
     * @param size Größe des Dreiecks
     */
    public static void dreieck1(int size) {
        for (int zeile=0; zeile<size; zeile++) {
            int anzahl = size-zeile;
            for (int s=0; s<anzahl; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dreieck1(4);
        System.out.println();
        dreieck1(7);
    }
}
