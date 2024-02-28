package Problems;
import java.util.Scanner;
import java.io.File;
public class generic_classes<T> {  //class name should be same as source file name or it triggers error
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public void getArea() {
    }
    public static void main(String[] args) {
        generic_classes<Integer> rectangle = new generic_classes<>();
        generic_classes<Double> circle = new generic_classes<>();
        rectangle.add(10);
        circle.add(2.5);
        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}

