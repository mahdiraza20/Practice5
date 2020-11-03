package m_mehdi;

import java.util.ArrayList;
/**
class add , draw and print three shapes
 */

public class Paint {
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;

/**
constructore to assign shapes arraylists
 */
    public Paint() {
        rectangles = new ArrayList<>();
        triangles = new ArrayList<>() ;
        circles = new ArrayList<>() ;
    }
    /**
    method to add rectangles
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }
    /**
    method to add Triangle
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }
    /**
    method to add Circle
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }
    /**
    method to draw all the shapes
     */
    public void drawAll() {
        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
        for (Triangle triangle : triangles) {
            triangle.draw();
        }
        for (Circle circle : circles) {
            circle.draw();
        }
        /**
        method to print as string
         */
    }
    public void printAll() {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
    }
 }
