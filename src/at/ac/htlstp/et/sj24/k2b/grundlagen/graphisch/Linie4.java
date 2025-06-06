package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Linie4 extends MyFrame {

    public static final int HEAD = 25;
    public static final int FOOT = 5;

    private Color farbe;

    public Linie4(String title, int width, int height) {
        super(title, width, height);
        farbe = Color.blue;
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linie4("Rechteck Muster", 800, 600);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(farbe);
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

    @Override public void keyPressed(KeyEvent e) {
        boolean changed=true;
        switch(e.getKeyChar()) {
            case 'r': farbe = Color.red; break;
            case 'g': farbe = Color.green; break;
            case 'b': farbe = Color.blue; break;
            default: changed=false; break;
        }
        if (changed) repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
