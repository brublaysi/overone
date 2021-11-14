package by.overone.lesson24;

public class MainFruit {
    public static void main(String[] args) {

        Fruit fruit = new Fruit(new Fruit.Clementine(8));
        System.out.println(fruit.toString());

        Fruit.Clementine clementine = new Fruit.Clementine(5);
        System.out.println(clementine);

        clementine.getAmount();

     }
}
