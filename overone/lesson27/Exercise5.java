package by.overone.lesson27;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;


public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        UnaryOperator<Integer> squareOfNums = (x) -> x * x;
        System.out.println(squareOfNums.apply(list.get(2)));

    }
}