package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public class Rechteck extends Zweipunkt {

    public Rechteck(Point p1, Point p2, Color linecolor, Color fillcolor, int width) {
        super(p1, p2, linecolor, fillcolor, width);
    }

    @Override
    public void paint(Graphics g) {
        int x = Math.min(p1.x, p2.x);
        int y = Math.min(p1.y, p2.y);
        int w = Math.abs(p2.x - p1.x);
        int h = Math.abs(p2.y - p1.y);

        if (fillcolor!=null) {
            g.setColor(fillcolor);
            g.fillRect(x,y,w,h);
        }
        g.setColor(linecolor);
        g.drawRect(x,y,w,h);
    }
}
