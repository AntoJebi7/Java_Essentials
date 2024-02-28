package Problems;

abstract class Shape {
    public int x, y;

    public abstract void printArea();
}

class Rectangle extends Shape {
    public void printArea() {
        System.out.println("Area of Rectangle is " + x * y);
    }
}

class Triangle extends Shape {
    public void printArea() {
        System.out.println("Area of Triangle is " + (x * y) / 2);
    }
}

class Circle extends Shape {
    public void printArea() {
        System.out.println("Area of Circle is " + (22 * x * x) / 7);
    }
}
public class abstract_classes {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.x = 5;
        r.y = 10;
        r.printArea();
        System.out.println();

        Triangle t = new Triangle();
        t.x = 6;
        t.y = 8;
        t.printArea();
        System.out.println();

        Circle c = new Circle();
        c.x = 5;
        c.printArea();
        System.out.println();
    }

}
