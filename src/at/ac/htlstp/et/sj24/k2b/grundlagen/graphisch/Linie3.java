package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public class Linie3 extends MyFrame{

    public Linie3(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linie3("Linie3", 800, 600);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0,0,getWidth(),getHeight());
    }
}
