public class Rectangle implements Shape{
    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double  height, double  width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return this.height * this.width;
    }
}
