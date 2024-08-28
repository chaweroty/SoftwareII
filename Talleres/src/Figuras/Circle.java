package Figuras;

public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
