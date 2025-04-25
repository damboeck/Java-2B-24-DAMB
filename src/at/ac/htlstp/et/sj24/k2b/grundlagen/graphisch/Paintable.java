package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public interface Paintable {

    void  paint(Graphics g);
    void  setLineColor(Color linecolor);
    void  setLineWidth(int width);
    void  setFillColor(Color fillcolor);
    Color getLineColor();
    int   getLineWidth();
    Color getFillColor();
}
