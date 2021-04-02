package com.BohdanKarp;

import com.BohdanKarp.Task1.Shape.Abstract.Shape;
import com.BohdanKarp.Task1.Shape.PlaneShape.Circle;
import com.BohdanKarp.Task1.Shape.PlaneShape.Rectangle;
import com.BohdanKarp.Task1.Shape.PlaneShape.Triangle;
import com.BohdanKarp.Task1.Shape.SpaceShape.Cuboid;
import com.BohdanKarp.Task1.Shape.SpaceShape.Sphere;
import com.BohdanKarp.Task1.Shape.SpaceShape.SquarePyramid;
import com.BohdanKarp.Task1.Shape.Vertex2D;
import com.BohdanKarp.Task1.Shape.Vertex3D;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Triangle(new Vertex2D(5,6), new Vertex2D(4,6), new Vertex2D(1,1));
        shapes[1] = new Circle(new Vertex2D(1,1), 3);
        shapes[2] = new Rectangle(new Vertex2D(2,2), 3, 4);
        shapes[3] = new Sphere(new Vertex3D(3,3,3), 7);
        shapes[4] = new Cuboid(new Vertex3D(4,4,4), 3, 2, 1);
        shapes[5] = new SquarePyramid(new Vertex3D(5,5,5),4,4);
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
}
