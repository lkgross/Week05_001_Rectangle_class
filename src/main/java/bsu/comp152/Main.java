package bsu.comp152;

import java.util.ArrayList;

/**
 * Is a (container) class for the Java program we run. It contains a main method with client code (a driver program) to create and manipulate objects using methods from the (blueprint) Rectangle class.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Create Rectangle object.
         * Call it rect.
         * Do an inline initialization of a Rectangle object.
         * We instantiate the Rectangle class.
         * We are creating an instance of the Rectangle class.
         */
        /*
         * There is a default Rectangle constructor that takes 0 arguments.
         * However, it is no longer available after we write our own constructor in the Rectangle class.
         */
        // Rectangle rect = new Rectangle();
        Rectangle rect = new Rectangle(11.71, 9.6);
        /*
         * Manipulate the Rectangle object rect using methods from the Rectangle class
         *
         * On rect, call the getLength method.
         * Print the returned value.
         */
        System.out.println(rect.getLength());
        /*
         * On rect, call the getLength method.
         * Print the returned value.
         */
        System.out.println(rect.getWidth());
        /*
         * On rect, call the setLength method.
         */
        rect.setLength(10.2);
        System.out.println(rect.getLength());
        rect.setWidth(2.33);
        System.out.println(rect.getWidth());
        /*
         * Printing an object directly gives the memory address for the object-
         * unless there is a toString method in the object's class, in which case the toString method gets called. (That toString method overrides the printing of the memory address.)
         */
        System.out.println(rect);

        System.out.println(rect.toString());
        Rectangle rect2 = new Rectangle(10.2, 2.33);
        System.out.println(rect2);
        System.out.printf("The two rectangles are equal: %b\n", rect.equals(rect2));
        Rectangle rect3 = new Rectangle();
        System.out.println(rect3);
        /* What happens if you try to use == to compare two objects? You end up comparing the addresses where two objects are stored. DON'T DO THIS! Call an equals method to see if the data is the same for the two objects.
         */
        System.out.printf("The two rectangles are equal: %b\n", rect == rect2);
        // Similarly, don't do a "reference copy".
        Rectangle rect4 = rect3;
        rect3.setLength(5.2);
        System.out.println(rect3);
        System.out.println(rect4);
        Rectangle rect5 = rect3.copy();
        Rectangle rect6 = new Rectangle(rect3);
        System.out.println("rect3: " + rect3);
        System.out.println("rect5: " + rect5);
        System.out.println("rect6: " + rect6);

        ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(rect);
        rectangleList.add(rect2);
        System.out.println("Rect3 is a square: " + rect3.isSquare());
        rect3.setWidth(5.2);
        System.out.println(rect3);
        System.out.println("Rect3 is a square: " + rect3.isSquare());
        rect3.getArea();
        System.out.printf("Area of rect3: %f\n", rect3.getArea());
        System.out.println(rect5);
        rect5.rotate();
        System.out.println(rect5);
    }
}
