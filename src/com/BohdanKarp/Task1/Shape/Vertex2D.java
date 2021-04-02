package com.BohdanKarp.Task1.Shape;

public class Vertex2D {
    protected double x;
    protected double y;

    public Vertex2D() {
        x = 0;
        y = 0;
    }

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Vertex2D vertex2D) {
        return Math.sqrt(Math.pow(this.x - vertex2D.x, 2) + Math.pow(this.y - vertex2D.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}