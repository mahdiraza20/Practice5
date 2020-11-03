package m_mehdi;

import java.util.ArrayList;
/**
 class for Triangle
 */
public class Triangle {
    private ArrayList<Integer> sides;
    public Triangle(int int1, int int2,int int3) {
        sides = new ArrayList<>();
        sides.add(int1);
        sides.add(int2);
        sides.add(int3);
    }
    /**
     method to get sides of triangle
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }
    /**
     method to show Weather it is Equilateral or not
     */
    public void isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) || sides.get(0).equals(2) || sides.get(1).equals(sides.get(2))) {
            System.out.println("Equilateral");
        }

    }
    /**
     *
     * method to calculate perimeter Triangle
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
        double area = 0;
        int j = sides.get(0) + sides.get(1) + sides.get(2);
        j /= 2;
        area = Math.sqrt(j * (j - sides.get(0)) * (j - sides.get(1)) * (j - sides.get(2)));
        return Math.sqrt(area);
    }
    /**
     * method to draw Triangle
     */
    public void draw() {
        System.out.println("-----------");
        System.out.println("Triangle");
        System.out.println("Perimeter is :"+calculatePerimeter());
        System.out.println("Area is :"+calculateArea());
        isEquilateral();
    }
    /**
     * method to check the equality of two triangles
     * @param triangle1
     */
    public void equals(Triangle triangle1) {
        int counter = 0;
        for (int i = 0; i < sides.size(); i++) {
            if (triangle1.sides.get(i).equals(sides.get(i))) {
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

        return "Triangle :" + sides.toString();


    }


}
