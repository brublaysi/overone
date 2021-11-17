package by.overone.lesson25;

import java.util.Scanner;

public class MainFor3Exercise extends RuntimeException {
    public static void main(String[] args) {
        Exercise3MyException exceptionSquare = new Exercise3MyException();
        int a, b, c, d;
        System.out.println("Enter four identical number");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        System.out.print("d = ");
        d = scanner.nextInt();

        Square square = new Square(a, b, c, d);
        int perimeter = square.getPerimeter();
        System.out.println("Perimeter of your square = " + perimeter);
        System.out.println(square.stackTrace());
    }
}
