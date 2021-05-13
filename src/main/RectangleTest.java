package main;
import Class.Rectangle;
public class RectangleTest {
    public static void main(String[] args) {
                Rectangle rectangle = new Rectangle();
                System.out.println(rectangle);

                rectangle = new Rectangle(4.3, 6.2);
                System.out.println(rectangle);

                rectangle = new Rectangle(5.5, 7.5, "orange", true);
                System.out.println(rectangle);
    }
}
