package com.BohdanKarp.Task1.Shape.Abstract;

import com.BohdanKarp.Task1.Shape.Interface.AreaMeasurable;
import com.BohdanKarp.Task1.Shape.Interface.VolumeMeasurable;
import com.BohdanKarp.Task1.Shape.Vertex3D;

public abstract class SpaceShape extends Shape<Vertex3D> implements AreaMeasurable, VolumeMeasurable {
}
