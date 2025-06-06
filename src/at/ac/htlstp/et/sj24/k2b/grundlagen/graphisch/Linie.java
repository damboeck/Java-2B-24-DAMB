package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public class Linie extends Zweipunkt {

    public Linie(Point p1, Point p2, Color linecolor, Color fillcolor, int width) {
        super(p1, p2, linecolor, fillcolor, width);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(linecolor);
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
    }

}