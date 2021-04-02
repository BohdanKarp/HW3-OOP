package com.BohdanKarp.Task1.Shape.SpaceShape;

import com.BohdanKarp.Task1.Shape.Abstract.SpaceShape;
import com.BohdanKarp.Task1.Shape.Vertex3D;

public class SquarePyramid extends SpaceShape {
    double width;
    double height;

    public SquarePyramid() {
        this.vertices = new Vertex3D[]{new Vertex3D(0, 0, 0)};
        width = 0;
        height = 0;
    }

    public SquarePyramid(Vertex3D vertex, double width, double height) {
        this.vertices = new Vertex3D[]{vertex};
        this.vertices[0] = vertex;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * width + (width * Math.sqrt(width * width + height * height) * 4 + width * width);
    }

    @Override
    public double getVolume() {
        return width * width * height / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid-> vertices:" + vertices[0].toString() + " | Width:" + width + " | Height:" + height + " | Volume:" + getVolume() + " | Area:" + getArea();
    }
}
