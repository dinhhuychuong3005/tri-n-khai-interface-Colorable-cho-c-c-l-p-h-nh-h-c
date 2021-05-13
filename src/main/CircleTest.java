package main;
import Class.Circle;
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(4.5,"black",true);
        System.out.println(circle.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
