package bsu.comp152;

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
    }
}