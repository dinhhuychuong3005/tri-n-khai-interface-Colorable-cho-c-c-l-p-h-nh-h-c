package main;
import Class.Square;
public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square(6, "yellow", true);
        System.out.println(square);
    }
}
