package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MusterSMUE extends MyFrame{

    boolean drawRectangle = true;

    public static void main(String[] args) {
        MusterSMUE frame = new MusterSMUE("Muster SMUE", 800, 600);
        frame.setVisible(true);
    }

    public MusterSMUE(String title, int width, int height) {
        super(title, width, height);
    }

    private void drawMyRecursive(Graphics g, int x0, int y0, int x4, int y4) {
        int h = y4-y0;
        int w = x4-x0;
        if (w<5) return;
        int x1 = x0+w/4;
        int y1 = h/4+y0;
        int x2 = x0+w/2;
        int y2 = h/2+y0;
        int x3 = x0+w*3/4;
        int y3 = h*3/4+y0;
        g.setColor(Color.blue);
        g.drawLine(x0,y2,x2,y0);
        g.drawLine(x2,y0,x4,y2);
        g.drawLine(x0,y2,x2,y4);
        g.drawLine(x2,y4,x4,y2);
        g.setColor(Color.red);
        if (drawRectangle)
            g.drawRect(x1,y1,w/2,h/2);
        drawMyRecursive(g,x1,y1,x3,y3);
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth()-2*FRAME;
        int h = getHeight()-(HEAD+FRAME);
        drawMyRecursive(g,FRAME,HEAD,getWidth()-FRAME,getHeight()-FRAME);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar()=='x') {
            drawRectangle = !drawRectangle;
            repaint();
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }
}
