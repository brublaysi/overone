package by.overone.lesson27;

import java.util.*;
import java.util.function.Supplier;

public class Exercise9and10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jojjk");
        list.add("aasds");
        list.add("aaxgh");
        list.add("bbbbb");
        list.add("jjihi");
        list.add("bobb");
        list.add("bboogg");
        list.add("bbn");

        System.out.println("Exercise 9");
        list.stream().filter(word -> word.startsWith("aa")).
                forEach(System.out::println);

        System.out.println("Exercise 10 ");
        list.stream().filter(word->word.startsWith("bb")).
                filter(word->word.length()>3).
                forEach(System.out::println);
    }
}

