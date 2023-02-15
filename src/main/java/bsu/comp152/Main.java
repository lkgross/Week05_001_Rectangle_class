package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        rect.setLength(10.2);
        System.out.println(rect.getLength());
    }
}