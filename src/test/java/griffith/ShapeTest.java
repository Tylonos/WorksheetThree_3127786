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
}
