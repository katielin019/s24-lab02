package edu.cmu.cs.cs214.lab02.shapes;

import edu.cmu.cs.cs214.lab02.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() { return this.height; }
    public double getWidth() { return this.width; }

    public void setHeight(double height) { this.height = height; }
    public void setWidth(double width) { this.width = width; }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
