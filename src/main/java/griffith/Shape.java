//Ivan Novik 3127786
package griffith;

import java.util.ArrayList;
import java.util.List;

//Abstract class representing a generic shape
abstract class Shape {
    private String name;

    //Constructor to initialize the shape with a name
    public Shape(String name) {
        this.name = name;
    }

    //Getter method for retrieving the name of the shape
    public String getName() {
        return name;
    }

    //Setter method to update the name of the shape
    public void setName(String name) {
        this.name = name;
    }

    //Abstract method to calculate the area of the shape
    public abstract double area();

    //Abstract method to calculate the perimeter of the shape
    public abstract double perimeter();

    //Returns a string representation of the shape
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}

//Circle subclass extending Shape
class Circle extends Shape {
    private double radius;

    //Constructor to initialize the circle with a name and radius
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    //Getter method for retrieving the radius of the circle
    public double getRadius() {
        return radius;
    }

    //Setter method to update the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Calculates the area of the circle using the formula πr²
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    //Calculates the perimeter of the circle using the formula 2πr
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //Returns a string representation of the circle including its radius
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}

//Rhombus subclass extending Shape
class Rhombus extends Shape {
    private double diagonal1; //First diagonal of the rhombus
    private double diagonal2; //Second diagonal of the rhombus
    private double side; //Length of one side of the rhombus

    //Constructor to initialize the rhombus with a name, diagonals, and side length
    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    //Getter method for retrieving the first diagonal
    public double getDiagonal1() {
        return diagonal1;
    }

    //Getter method for retrieving the second diagonal
    public double getDiagonal2() {
        return diagonal2;
    }

    //Getter method for retrieving the side length of the rhombus
    public double getSide() {
        return side;
    }

    //Calculates the area of the rhombus using the formula (d1 * d2) / 2
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    //Calculates the perimeter of the rhombus using the formula 4 * side
    @Override
    public double perimeter() {
        return 4 * side;
    }

    //Returns a string representation of the rhombus including its diagonals and side length
    @Override
    public String toString() {
        return super.toString() + ", Diagonals: " + diagonal1 + " & " + diagonal2 + ", Side: " + side;
    }
}

//Right-angled Triangle subclass extending Shape
class RightAngledTriangle extends Shape {
    private double base; //Base length of the triangle
    private double height; //Height of the triangle

    //Constructor to initialize the right-angled triangle with a name, base, and height
    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    //Getter method for retrieving the base length
    public double getBase() {
        return base;
    }

    //Getter method for retrieving the height
    public double getHeight() {
        return height;
    }

    //Calculates the area of the right-angled triangle using the formula 0.5 * base * height
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    //Calculates the perimeter using the base, height, and hypotenuse (Pythagorean theorem)
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt((base * base) + (height * height)); // Calculating the hypotenuse
        return base + height + hypotenuse; // Sum of all sides
    }

    //Returns a string representation of the right-angled triangle including its base and height
    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}