package Problems;

import java.util.*;

interface shape {
    public static final int x = 7;
    public static final int y = 5;
    public void printArea();
}

class rectangle implements shape {
    public void printArea() {
        System.out.println("Area of Rectangle is " + x * y);
    }
}

class triangle implements shape {
    public void printArea() {
        System.out.println("Area of Triangle is " + (x * y) / 2);
    }
}

class circle implements shape {
    public void printArea() {
        System.out.println("Area of Circle is " + (22 * x * x) / 7);
    }
}

public class interface_classes {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.printArea();

        triangle t = new triangle();
        t.printArea();

        circle c = new circle();
        c.printArea();
    }
}

