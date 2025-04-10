package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class LineDrehen extends MyFrame{

    private int winkel = 0;

    public static void main(String[] args) {
        (new LineDrehen("Linie drehen", 800, 600)).setVisible(true);
    }

    public LineDrehen(String title, int width, int height) {
        super(title, width, height);
    }

    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        winkel += e.getWheelRotation()*5;
        if (winkel>=360) winkel -= 360;
        if (winkel<0) winkel   += 360;
        repaint();
    }


    @Override
    public void paint(Graphics g) {
        int r=(getWidth()+getHeight())/2;
        double mx = getWidth()/2.;
        double my = getHeight()/2.;
        double s = getWidth()/11.0;
        double cos = Math.cos(Math.toRadians(winkel));
        double sin = Math.sin(Math.toRadians(winkel));
        for (int i=-10;i<=10;i++) {
            double mmx = mx+i*s*sin;
            double mmy = my+i*s*cos;
            g.drawLine((int) (mmx - cos * r), (int) (mmy + sin * r), (int) (mmx + cos * r), (int) (mmy - sin * r));
        }
        /*mx += -s*sin;
        my += -s*cos;
        g.drawLine((int)(mx-cos*r),(int)( my+sin*r),(int)( mx+cos*r), (int)(my-sin*r));*/

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

}
