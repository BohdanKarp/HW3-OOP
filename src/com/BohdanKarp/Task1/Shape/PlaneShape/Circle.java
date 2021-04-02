package com.BohdanKarp.Task1.Shape.PlaneShape;

import com.BohdanKarp.Task1.Shape.Abstract.PlaneShape;
import com.BohdanKarp.Task1.Shape.Vertex2D;

public class Circle extends PlaneShape {
    public double radius;

    public Circle() {
        this.vertices = new Vertex2D[]{new Vertex2D()};
        radius = 0;
    }

    public Circle(Vertex2D vertices, double radius) {
        this.vertices = new Vertex2D[]{vertices};
        this.vertices[0] = vertices;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle-> vertices:" + vertices[0].toString() + " | Radius:" + radius + " | Perimeter:" + getPerimeter() + " | Area:" + getArea();
    }
}


