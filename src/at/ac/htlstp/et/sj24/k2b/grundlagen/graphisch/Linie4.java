package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public class Linie4 extends MyFrame {

    public static final int HEAD = 25;
    public static final int FOOT = 5;

    public Linie4(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linie4("Rechteck Muster", 800, 600);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        int w = getWidth();
        int h = getHeight();
        /*g.drawLine(0,0,w/4,h/4);
        g.drawLine(w*3/4,h/4,w,0);
        g.drawLine(0,h,w/4,h*3/4);
        g.drawLine(w*3/4,h*3/4,w,h);
        g.drawRect(w/4,h/4,w/2,h/2);*/
        h-=HEAD+FOOT;
        g.drawLine(0,HEAD+0,w/4,HEAD+h/4);
        g.drawLine(w*3/4,HEAD+h/4,w,HEAD+0);
        g.drawLine(0,HEAD+h,w/4,HEAD+h*3/4);
        g.drawLine(w*3/4,HEAD+h*3/4,w,HEAD+h);
        g.drawRect(w/4,HEAD+h/4,w/2,h/2);
    }


}
