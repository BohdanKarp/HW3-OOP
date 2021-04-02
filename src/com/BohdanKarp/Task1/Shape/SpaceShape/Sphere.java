package com.BohdanKarp.Task1.Shape.SpaceShape;

import com.BohdanKarp.Task1.Shape.Abstract.SpaceShape;
import com.BohdanKarp.Task1.Shape.Vertex3D;

public class Sphere extends SpaceShape {
    double radius;

    public Sphere() {
        this.vertices = new Vertex3D[]{new Vertex3D(0, 0, 0)};
        radius = 0;
    }

    public Sphere(Vertex3D vertex, double radius) {
        this.vertices = new Vertex3D[]{vertex};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        return "Sphere-> vertices:" + vertices[0].toString() + " | Radius:" + radius + " | Volume:" + getVolume() + " | Area:" + getArea();
    }
}
