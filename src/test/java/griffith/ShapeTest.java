package griffith;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {
    private static final double EPSILON = 0.0001;

    @Test
    void testCircle() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
    }

    @Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus", 8, 6, 5);
        assertEquals((8 * 6) / 2, rhombus.area(), EPSILON);
        assertEquals(4 * 5, rhombus.perimeter(), EPSILON);
    }

    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("Right-Angled Triangle", 3, 4);
        assertEquals(0.5 * 3 * 4, triangle.area(), EPSILON);
        assertEquals(3 + 4 + 5, triangle.perimeter(), EPSILON);
    }
}
