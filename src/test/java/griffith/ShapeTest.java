//Ivan Novik 3127786
package griffith;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//Test class for Shape and its subclasses
class ShapeTest {
    private static final double EPSILON = 0.0001; //Tolerance for floating-point comparisons

    //Test method for Circle class
    @Test
    void testCircle() {
        Circle circle = new Circle("Circle", 3.5); //Creating a circle object with radius 3.5

        //Checking if the calculated area is correct
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);

        //Checking if the calculated perimeter is correct
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
    }

    //Test method for Rhombus class
    @Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus", 8, 6, 5); //Creating a rhombus object with given diagonals and side

        //Checking if the calculated area is correct
        assertEquals((8 * 6) / 2, rhombus.area(), EPSILON);

        //Checking if the calculated perimeter is correct
        assertEquals(4 * 5, rhombus.perimeter(), EPSILON);
    }

    //Test method for Right-Angled Triangle class
    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("Right-Angled Triangle", 3, 4); // Creating a right-angled triangle

        //Checking if the calculated area is correct
        assertEquals(0.5 * 3 * 4, triangle.area(), EPSILON);

        //Checking if the calculated perimeter is correct
        assertEquals(3 + 4 + 5, triangle.perimeter(), EPSILON);
    }

    //Integration test to check a list of different shape objects
    @Test
    void testShapesList() {
        List<Shape> shapes = new ArrayList<>(); //Creating a list to store Shape objects

        //Adding different shapes to the list
        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 5));
        shapes.add(new Rhombus("Rhombus", 8, 6, 5));
        shapes.add(new Rhombus("Rhombus", 10, 8, 6));
        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 5, 12));

        //Iterating through the list and checking if area and perimeter values are positive
        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0); //Ensuring area is greater than 0
            assertTrue(shape.perimeter() > 0); //Ensuring perimeter is greater than 0
        }
    }
}