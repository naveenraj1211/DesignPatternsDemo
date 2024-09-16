package org.example.flyweight.graphicalediting;

public interface FlyweightRegistry {

    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}