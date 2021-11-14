package by.overone.lesson22;

import java.util.*;

public class MainUnique {
    public static void main(String[] args) {

        Map<String, String> nameSurname = new HashMap<>();

        Unique unique = new Unique();
        nameSurname.put("John", "Devine");
        nameSurname.put("Stieve", "Bush");
        nameSurname.put("Barak", "Obama");
        nameSurname.put("Dolly", "Koylee");
        nameSurname.put("Tom", "Hanks");

        System.out.println(nameSurname);
        System.out.println("First try is " + unique.isUnique(nameSurname));
        System.out.println("Second try is " + unique.isUnique1(nameSurname));
    }
}
