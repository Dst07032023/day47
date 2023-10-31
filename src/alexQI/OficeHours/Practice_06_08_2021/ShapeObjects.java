package alexQI.OficeHours.Practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square squareOne = new Square();
        squareOne.side = 5;
        squareOne.calculateArea();
        squareOne.calculatePerimeter();
        System.out.println(squareOne);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length = 4;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);
    }
}
