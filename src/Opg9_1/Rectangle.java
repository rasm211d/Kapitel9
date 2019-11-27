package Opg9_1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("new rectangle is created");
        System.out.println("the area is = " + getArea());
        System.out.println("the perimeter is = " + getPerimeter());
        System.out.println();
    }


    public double getArea() {
        double area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = height * 2 + width * 2;
        return perimeter;
    }

}
