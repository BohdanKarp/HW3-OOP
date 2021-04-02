package com.BohdanKarp.Task1.Shape.PlaneShape;

import com.BohdanKarp.Task1.Shape.Abstract.PlaneShape;
import com.BohdanKarp.Task1.Shape.Vertex2D;

public class Rectangle extends PlaneShape {
    double width;
    double height;

    public Rectangle() {
        this.vertices = new Vertex2D[]{new Vertex2D()};
        width = 0;
        height = 0;
    }

    public Rectangle(Vertex2D vertex, double width, double height) {
        this.vertices = new Vertex2D[]{vertex};
        this.width = width;
        this.height = height;
        this.vertices[0] = vertex;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle-> vertices:" + vertices[0].toString() + " | Width:" + width + " | Height:" + height + " | Perimeter:" + getPerimeter() + " | Area:" + getArea();
    }
}
