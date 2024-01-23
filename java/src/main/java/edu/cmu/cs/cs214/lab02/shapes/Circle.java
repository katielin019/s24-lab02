package edu.cmu.cs.cs214.lab02.shapes;

import edu.cmu.cs.cs214.lab02.Shape;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
