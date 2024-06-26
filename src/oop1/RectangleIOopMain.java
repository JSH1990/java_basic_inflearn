package oop1;

public class RectangleIOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 10;

        int area = rectangle.calculaterArea();
        System.out.println("넓이 :" + area);

        int permeter = rectangle.calculatePermeter();
        System.out.println("둘레 길이:" + permeter);
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);


    }
}