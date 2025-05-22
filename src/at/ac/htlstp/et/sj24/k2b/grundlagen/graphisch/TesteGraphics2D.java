package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class TesteGraphics2D extends MyFrame {

    int   arg   = 0;
    float scale = 1;
    float phase = 0;

    public static void main(String[] args) {
        TesteGraphics2D frame = new TesteGraphics2D("Teste Graphics 2D", 800, 600);
        frame.setVisible(true);
    }

    public TesteGraphics2D(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.red);
        //g2d.setStroke(new BasicStroke(2));
        g2d.setStroke(new BasicStroke(6f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10f, new float[]{50f, 5f, 2f, 5f}, phase));
        g2d.translate(w/2+100, h/2+50);
        g2d.rotate(Math.PI/180*arg);
        g2d.scale(scale, scale);
        g2d.drawRect(-100,-50,200,100);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case '+' -> scale += 0.1;
            case '-' -> scale -= 0.1;
            case '1' -> phase += 1f;
            case '2' -> phase = phase>0?phase-1f:0f;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        arg += e.getWheelRotation()*5;
        repaint();
    }
}
