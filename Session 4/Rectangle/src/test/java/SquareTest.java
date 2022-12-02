import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void computeArea() {
        Shape square = new Square(4);
        double area = square.computeArea();
        assertEquals(16.0, area);
    }

    @Test
    public void modifySides() {
        Square square = new Square(4);
        assertEquals(16.0, square.computeArea());

        square.setSide(3);
        assertEquals(9.0, square.computeArea());

        square.setSide(10);
        double side = square.getSide();
        assertEquals(side*side, square.computeArea());
    }
}