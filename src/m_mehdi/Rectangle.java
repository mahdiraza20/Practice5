package m_mehdi;

import java.util.ArrayList;
/**
class for rectangle
 */

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int int1, int int2,int int3, int int4) {
        sides = new ArrayList<>();
        sides.add(int1);
        sides.add(int2);
        sides.add(int3);
        sides.add(int4);
    }
    /**
    method to get sides of rectangle
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }
    /**
    method to show wether i is square or not
     */
    public void isSquare() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(2) && sides.get(0).equals(sides.get(3)) && sides.get(1).equals(sides.get(2)) && sides.get(1).equals(sides.get(3)) && sides.get(2).equals(sides.get(3))){
            System.out.println("is square");
        }
    }

    /**
     *
     * method to add Triangle
     *
     * @return perimeter
     */
    public double calculatePerimeter() {
        double perimeter = 0;
        for (Integer side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    /**
     * method calculate area
     * @return area
     */
    public double calculateArea() {
        double area = 1;
        for (Integer side : sides) {
            area *= side;
        }
        return Math.sqrt(area);
    }

    /**
     * method to draw rectangle
     */
    public void draw() {
        System.out.println("-----------");
        System.out.println("Rectangle");
        System.out.println("Perimeter is :"+calculatePerimeter());
        System.out.println("Area is :"+calculateArea());
        isSquare();
    }

    /**
     * method to check the equality of two rectangles
     * @param rectangle1
     */
    public void equals(Rectangle rectangle1) {
        int counter = 0;
        for (int i = 0; i < sides.size(); i++) {
            if (rectangle1.sides.get(i).equals(sides.get(i))) {
                counter++;
            }
        }
        if (counter == sides.size()) {
            System.out.println("equal");
        } else
            System.out.println("not equal");

    }

    /**
     * method to cast to string
     * @return
     */
    public String toString() {

        return "Rectangle :" + sides.toString();


    }


}
