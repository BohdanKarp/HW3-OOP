package com.BohdanKarp.Task1.Shape.SpaceShape;

import com.BohdanKarp.Task1.Shape.Abstract.SpaceShape;
import com.BohdanKarp.Task1.Shape.Vertex3D;

public class Cuboid extends SpaceShape {
    double width;
    double height;
    double depth;

    public Cuboid() {
        this.vertices = new Vertex3D[]{new Vertex3D(0, 0, 0)};
        width = 0;
        height = 0;
        depth = 0;
    }

    public Cuboid(Vertex3D vertex, double width, double height, double depth) {
        this.vertices = new Vertex3D[]{vertex};
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.vertices[0] = vertex;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid-> vertices:" + vertices[0].toString() + " | Width:" + width + " | Height:" + height + " | Depth:" + depth + " | Volume:" + getVolume() + " | Area:" + getArea();
    }
}
