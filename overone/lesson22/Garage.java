package by.overone.lesson22;

import java.util.HashMap;

public class Garage {
    public static void main(String[] args) {

        HashMap<Car, Integer> garage = new HashMap<>();
        Tesla tesla = new Tesla();
        Citroen citroen = new Citroen();
        Lexus lexus = new Lexus();
        Toyota toyota = new Toyota();

        Integer amountOfToyta = 1;
        Integer amountOfTesla = 2;
        Integer amountOfCitroen = 5;
        Integer amountOfLexus = 3;

        garage.put(tesla, amountOfTesla);
        garage.put(citroen, amountOfCitroen);
        garage.put(lexus, amountOfLexus);
        garage.put(toyota, amountOfToyta);
    }

    public void leaveTheParking() {
    }
}

