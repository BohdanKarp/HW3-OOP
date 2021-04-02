package com.BohdanKarp.Task1.Shape.Abstract;

import com.BohdanKarp.Task1.Shape.Interface.AreaMeasurable;
import com.BohdanKarp.Task1.Shape.Interface.PerimeterMeasurable;
import com.BohdanKarp.Task1.Shape.Vertex2D;

public abstract class PlaneShape extends Shape<Vertex2D> implements PerimeterMeasurable, AreaMeasurable {
}
