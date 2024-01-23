package edu.cmu.cs.cs214.lab02;

public class Renderer {
    public Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
