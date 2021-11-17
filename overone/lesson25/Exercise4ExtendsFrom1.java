package by.overone.lesson25;

import java.util.Scanner;

public class Exercise4ExtendsFrom1 {
    public static void main(String[] args) {
        MyException myException = new MyException();
        myException.MyException("Write something");
        Exercise exercise1 = new Exercise();
        exercise1 = null;
        System.out.println(exercise1.myMethod());
    }
    public Exercise4ExtendsFrom1() {
        System.out.println("You can write a message now");
        Scanner scanner = new Scanner(System.in);

    }
    String myMethod(){

        Exercise exercise1 = null;
        try {
            exercise1.hashCode();
            return "IDEA try";
        } catch (NullPointerException exception) {
            throw new MyException(exception);
            return "IDEA catch exception";
        }
    }
}
