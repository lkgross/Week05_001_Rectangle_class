package bsu.comp152;

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
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 0.0;
        width = 0.0;
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
        // placeholder
        // TODO: Complete this part!
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

    public Rectangle copy(Rectangle other) {
        return;
    }
}
