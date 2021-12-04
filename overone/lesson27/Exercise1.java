package by.overone.lesson27;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        IShape quadrate = x -> x * 2;
        int resultQuadrate = quadrate.getSquare(5);
        System.out.println("Square of quadrate = " + resultQuadrate);

        IShape rectangle = x -> x;
        System.out.println("Enter the length of one side ");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        System.out.println("Enter the length of adjacent side ");
        int sideB = scanner.nextInt();
        int x = sideA*sideB;
        int resultRectangle = rectangle.getSquare(x);
        System.out.println("Square of rectangle = " + resultRectangle);
    }
}
