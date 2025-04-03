package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public class Linie2 extends Linie1 {
    public Linie2(String title, int width, int height) {
        super(title, width, height);
    }

    public static void main(String[] args) {
        new Linie2("Linie2", 800, 600);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.fillOval(300,300,200,100);
    }
}
