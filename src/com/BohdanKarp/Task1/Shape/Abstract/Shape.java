package com.BohdanKarp.Task1.Shape.Abstract;

import com.BohdanKarp.Task1.Shape.Vertex2D;

public abstract class Shape<T extends Vertex2D> {
    protected T[] vertices;
}

