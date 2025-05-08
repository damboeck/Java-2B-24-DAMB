package at.ac.htlstp.et.sj24.k2b.grundlagen.graphisch;

import java.awt.*;

public abstract class Zweipunkt implements Paintable, Editable{

    protected Color fillcolor;
    protected Color linecolor;
    protected Point p1,p2;
    protected int   width;

    public Zweipunkt(Point p1, Point p2, Color linecolor, Color fillcolor, int width) {
        this.p1 = p1;
        this.p2 = p2;
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
        this.width = width;
    }

    @Override
    public void setLineColor(Color linecolor) {
        this.linecolor = linecolor;
    }

    @Override
    public void setLineWidth(int width) {
        this.width = width;
    }

    @Override
    public void setFillColor(Color fillcolor) { this.fillcolor = fillcolor; }

    @Override
    public Color getLineColor() {
        return linecolor;
    }

    @Override
    public int getLineWidth() {
        return width;
    }

    @Override
    public Color getFillColor() {
        return null;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public boolean addPoint(Point p) {
        p2 = p;
        return true;
    }

    @Override
    public void setCursor(Point p) {
        p2 = p;
    }

}
