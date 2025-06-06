package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;
import java.awt.event.*;

public abstract class   MyFrame
    extends    Frame
    implements WindowListener, ComponentListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {

    public static final int HEAD = 30;
    public static final int FRAME = 8;

    public MyFrame(String title, int width, int height) {
        super(title);
        setSize(width, height);
        addWindowListener(this);
        addComponentListener(this);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }

    @Override
    public abstract void paint(Graphics g);

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        repaint();
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
    @Override public void componentMoved(ComponentEvent e) {

    }
    @Override public void componentShown(ComponentEvent e) {

    }
    @Override public void componentHidden(ComponentEvent e) {

    }
    @Override public void keyTyped(KeyEvent e) {

    }
    @Override public abstract void keyPressed(KeyEvent e);
    @Override public void keyReleased(KeyEvent e) {

    }
    @Override public void mouseClicked(MouseEvent e) {

    }
    @Override public void mouseReleased(MouseEvent e) {

    }
    @Override public void mouseEntered(MouseEvent e) {

    }
    @Override public void mouseExited(MouseEvent e) {

    }
    @Override public void mouseDragged(MouseEvent e) {

    }
    @Override public void mouseMoved(MouseEvent e) {

    }
    @Override public void mouseWheelMoved(MouseWheelEvent e) {

    }

}
