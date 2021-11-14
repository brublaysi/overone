package by.overone.lesson24;

public class Fruit {
    private Clementine clementine;

    public Fruit(Clementine clementine) {
        this.clementine = clementine;
    }

    @Override
    public String toString() {
        return "Fruit " + clementine;
    }

    static class Clementine {
        private int seed;

        public Clementine (int seed) {
            this.seed = seed;
        }


        public void getAmount() {
            Fruit fruit = new Fruit(new Fruit.Clementine(4));
            System.out.println(fruit.clementine);
        }

        @Override
        public String toString() {
            return "Clementine have " + seed + " seed";
        }
    }
}
