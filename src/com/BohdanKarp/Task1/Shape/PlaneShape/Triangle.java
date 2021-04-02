package com.BohdanKarp.Task1.Shape.PlaneShape;

import com.BohdanKarp.Task1.Shape.Abstract.PlaneShape;
import com.BohdanKarp.Task1.Shape.Vertex2D;

public class Triangle extends PlaneShape {
    public Triangle() {
        this.vertices = new Vertex2D[]{new Vertex2D(), new Vertex2D(), new Vertex2D()};
    }

    public Triangle(Vertex2D vertex1, Vertex2D vertex2, Vertex2D vertex3) {
        this.vertices = new Vertex2D[]{vertex1, vertex2, vertex3};
        this.vertices[0] = vertex1;
        this.vertices[1] = vertex2;
        this.vertices[2] = vertex3;
    }

    @Override
    public double getPerimeter() {
        return vertices[0].distance(vertices[1]) + vertices[1].distance(vertices[2]) + vertices[2].distance(vertices[0]);
    }

    @Override
    public double getArea() {
        return this.getPerimeter() * (this.getPerimeter() - vertices[0].distance(vertices[1])) * (this.getPerimeter() - vertices[1].distance(vertices[2])) * (this.getPerimeter() - vertices[2].distance(vertices[0]));
    }

    @Override
    public String toString() {
        return "Triangle-> vertices:" + vertices[0].toString() + vertices[1].toString() + vertices[2].toString() + " | Perimeter:" + getPerimeter() + " | Area:" + getArea();
    }
}
