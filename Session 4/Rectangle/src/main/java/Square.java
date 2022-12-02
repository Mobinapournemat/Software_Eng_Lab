public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return this.side * this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}