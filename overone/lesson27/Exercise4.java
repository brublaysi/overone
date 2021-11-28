package by.overone.lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {

        Predicate<Integer> predicate = num -> num > 0;

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(-5);
        array.add(98);
        array.add(44);
        array.add(-1);
        array.add(-12);

        List<Integer> newArray = array.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        newArray.forEach(System.out::println);

    }
}
