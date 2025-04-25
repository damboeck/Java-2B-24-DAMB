package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public interface Editable {

    /**
     * Fügt einen Punkt an das Objekt an
     * @param p Punkt
     * @return  true wenn das Objekt damit fertig ist
     */
    boolean addPoint(Point p);

    /**
     * Setzt den Cursor auf den Punkt p für das Gummiband
     * @param p Punkt
     */
    void setCursor(Point p);

}
