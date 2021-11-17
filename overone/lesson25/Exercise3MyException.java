package by.overone.lesson25;

public class Exercise3MyException {

}
class Square extends Exception {
    private int a, b, c, d;
    public Square(){
        a=b=c=d=5;
    }

    public Square(int firstSide, int secondSide, int thirdSide, int fourthSide) {
        try {
            if (firstSide < secondSide || secondSide < thirdSide ||
                    thirdSide < fourthSide || fourthSide < firstSide)
                throw new Square();
        }
        catch (Square exception){
            System.err.println("Exception: Wrong size of square! Your numbers are not identical ");
            return;
        }

        this.a = firstSide;
        this.b = secondSide;
        this.c = thirdSide;
        this.d = fourthSide;
    }
    public int getPerimeter() {
        int perimeter = a + b + c + d;
        return perimeter;
    }

    public static String stackTrace() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName() + " " + element.getLineNumber());
        }
        return "You have some mistakes ";
    }
}
