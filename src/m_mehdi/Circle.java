package m_mehdi;

import java.util.ArrayList;
/**
 class for Circle
 */
public class Circle {
        int radius;
        public Circle(int int1) {
            radius = int1;
        }
    /**
     method to get radius of Circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * method to calculate perimeter of Circle
     * @return perimeter
     */
        public double calculatePerimeter() {
            double perimeter = (radius * 2) * Math.PI;

            return perimeter;
        }
    /**
     * method to calculate area of Circle
     * @return area
     */
        public double calculateArea() {
            double area = (radius * radius) * Math.PI;
            return area;
        }
    /**
     * method to draw Circle
     */
        public void draw() {
            System.out.println("-----------");
            System.out.println("Circle");
            System.out.println("Perimeter is :"+calculatePerimeter());
            System.out.println("Area is :"+calculateArea());
        }
    /**
     * method to check the equality of two Circles
     * @param circle1
     */
    public void equals(Circle circle1) {
            if (circle1.radius == (radius)) {
                System.out.println("equal");
            }

        }
    /**
     * method to cast to string
     * @return radius
     */
    public String toString() {

        return "Circle : [" +radius+ "]";


    }



}
