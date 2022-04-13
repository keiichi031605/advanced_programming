package ex2;
public class Ellipse {
    private double radiusA;
    private double radiusB;

    public Ellipse(double radiusA, double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public double area() throws InvalidShape {
       if (radiusA < 1 && radiusB < 1)
           throw new InvalidShape();
       return Math.PI * radiusA * radiusB;
    }

}

 

