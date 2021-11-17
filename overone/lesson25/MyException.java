package by.overone.lesson25;

import java.util.Scanner;

public class MyException extends RuntimeException{
    public MyException() {
    }

    public String MyException (String message) {
            System.out.println("You can write a message now");
            Scanner scanner = new Scanner(System.in);
            message = scanner.next();
            return message;
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
