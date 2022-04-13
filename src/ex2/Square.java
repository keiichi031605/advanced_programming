package ex2;
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;

    }

    public double area() throws InvalidShape {
                if (side < 1)
                   throw new InvalidShape();
        return side * side;
    }
}

