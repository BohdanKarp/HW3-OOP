package com.BohdanKarp.Task1.Shape;

public class Vertex3D extends Vertex2D {
    private double z;

    public Vertex3D() {
        super();
        this.z = 0;
    }

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distance(Vertex3D vertex3D) {
        return Math.sqrt(Math.pow(this.x - vertex3D.x, 2) + Math.pow(this.y - vertex3D.y, 2) + Math.pow(this.z - vertex3D.z, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}