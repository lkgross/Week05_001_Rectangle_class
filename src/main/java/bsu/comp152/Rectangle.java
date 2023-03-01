package bsu.comp152;

import org.w3c.dom.css.Rect;

/**
 * A (blueprint) class for creating and manipulating
 * Rectangle objects.
 */
public class Rectangle {

    /*
     * The Rectangle class has (private) "instance fields"
     * length and width.
     * Declare these at the top of the class.
     */
    private double length;
    private double width;

    /*
     * A constructor has the same name as the class.
     * A constructor is public.
     * A constructor has no return type, not even void!
     */

    /*
     * Methods (including constructors) can be overloaded:
     * You can write multiple methods that have the same name,
     * as long as the "signatures" are different.
     * The signature consists of the method's name and the types of the parameters, in the order in which they appear.
     * (The method's return type is not part of the signature.)
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    /*
     * We can write a copy constructor (as an alternative to a copy method like we wrote below).
     */
    public Rectangle(Rectangle original){
        length = original.length;
        width = original.width;
    }


    /*
     * The Rectangle class has (public) "instance methods",
     * e.g., getLength, getWidth, setLength.
     * Accessors (getters) return information about the rectangle.
     * Mutators (setters) set (modify) information associated with the rectangle.
     */

    /**
     * A getter (accessor) in the Rectangle class
     *
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: length %f, width %f", length, width);
    }

    public boolean equals(Rectangle other) {
        return (length == other.length) && (width == other.width);
    }

    /**
     * A setter (mutator) in the Rectangle class
     */
    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double wid) {
        width = wid;
    }

    public Rectangle copy() {
        Rectangle r = new Rectangle(length, width);
        return r;
    }
}
