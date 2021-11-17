package by.overone.lesson25;

public class Exercise5 {
    public static void main(String[] args) {
        String string = null;

        try {
            System.out.println(string.length());
        }
        catch (NullPointerException exceptionNull){
            System.out.println("null pointer can't be here");
            throw (MyException)
                    new MyException().initCause(exceptionNull);

        }
    }
}
