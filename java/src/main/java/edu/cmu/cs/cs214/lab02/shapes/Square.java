package edu.cmu.cs.cs214.lab02.shapes;

import edu.cmu.cs.cs214.lab02.Shape;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen() { return sideLen; }

    public void setSideLen(double sideLen) { this.sideLen = sideLen; }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
