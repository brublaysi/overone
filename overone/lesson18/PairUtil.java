package by.overone.lesson18;

public final class PairUtil {

    public static <Y> String swap(Pair pair) {
        String first = (String) pair.getSomething2();
        String second = (String) pair.getSomething();
        return (first + " " + second);
    }
}
