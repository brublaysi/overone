package by.overone.lesson25;

import java.util.Random;

public class Exercise2{
    public static void main(String[] args) {
        int[] array = new int [3];
        Random random = new Random();
        for (int i = 0; i<= array.length; i++);

        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array length is smaller, that you think");
        }
    }
}
