package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Linie1 extends Frame implements WindowListener {

    public Linie1(String title, int width, int height) {
        this.setTitle(title);
        setSize(width, height);
        addWindowListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Linie1("Hallo Welt!", 800, 600);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(100, 100, 200, 200);
        g.setColor(Color.BLUE);
        g.drawLine(200, 100, 100, 200);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowOpened(WindowEvent e) {

    }
    @Override public void windowClosed(WindowEvent e) {

    }
    @Override public void windowIconified(WindowEvent e) {

    }
    @Override public void windowDeiconified(WindowEvent e) {

    }
    @Override public void windowActivated(WindowEvent e) {

    }
    @Override public void windowDeactivated(WindowEvent e) {

    }

}
