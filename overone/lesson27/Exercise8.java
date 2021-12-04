package by.overone.lesson27;

import java.util.Scanner;
import java.util.function.Supplier;

public class Exercise8 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            System.out.println("Write somethig");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            String reverse = "";

            for (int i = string.length()-1; i >= 0 ; i--)
                reverse += string.charAt(i);
            return reverse;
        };
        System.out.println(supplier.get());
    }
}
