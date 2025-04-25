package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class DrawLine extends MyFrame {

    Vector<Paintable> paintables = new Vector<>();
    Paintable actual = null;

    DrawMode drawMode = DrawMode.NORMAL;

    Color lineColor = Color.black;
    Color fillColor = Color.white;
    int   linewidth = 1;

    public static void main(String[] args) {
        DrawLine f  = new DrawLine("DrawLine", 800, 600);
        f.setVisible(true);
    }

    public DrawLine(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    public void paint(Graphics g) {
        for (Paintable l : paintables) {
            l.paint(g);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'r' -> lineColor = Color.red;
            case 'g' -> lineColor = Color.green;
            case 'b' -> lineColor = Color.blue;
            case 'w' -> lineColor = Color.white;
            case 'c' -> lineColor = Color.cyan;
            case 'y' -> lineColor = Color.yellow;
            case 'm' -> lineColor = Color.magenta;
            case 'o' -> lineColor = Color.orange;
            case 'p' -> lineColor = Color.pink;
            case 's' -> lineColor = Color.black;
            case 'R' -> fillColor = Color.red;
            case 'G' -> fillColor = Color.green;
            case 'B' -> fillColor = Color.blue;
            case 'W' -> fillColor = Color.white;
            case 'C' -> fillColor = Color.cyan;
            case 'Y' -> fillColor = Color.yellow;
            case 'M' -> fillColor = Color.magenta;
            case 'O' -> fillColor = Color.orange;
            case 'P' -> fillColor = Color.pink;
            case 'S' -> fillColor = Color.black;
        }
        if (drawMode==DrawMode.GUMMI) {
            actual.setLineColor( lineColor);
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch(drawMode) {
            case NORMAL -> {
                actual = new Linie(e.getPoint(), e.getPoint(), lineColor, fillColor, linewidth);
                paintables.add(actual);
                repaint();
                drawMode = DrawMode.GUMMI;
            }
            case GUMMI -> {
                if (actual instanceof Editable) {
                    boolean result = ((Editable) actual).addPoint(e.getPoint());
                    repaint();
                    if (result) {
                        drawMode = DrawMode.NORMAL;
                        actual = null;
                    }
                }
            }
        }
    }

    @Override public void mouseMoved(MouseEvent e) {
        switch (drawMode) {
            case NORMAL -> {}
            case GUMMI  -> {
                if (actual instanceof Editable) {
                    ((Editable) actual).setCursor(e.getPoint());
                    repaint();
                }
            }
        }
    }

}
