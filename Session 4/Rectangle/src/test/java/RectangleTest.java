import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(2, 6);
        double area = rectangle.computeArea();
        assertEquals(12.0, area);
    }

    @Test
    void modifySides() {
        Rectangle rectangle = new Rectangle(2, 6);
        assertEquals(12.0, rectangle.computeArea());

        rectangle.setHeight(5);
        assertEquals(30.0, rectangle.computeArea());

        rectangle.setWidth(10.0);
        assertEquals(50.0, rectangle.computeArea());
    }
}