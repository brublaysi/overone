package by.overone.lesson27;

public class Exercise2 {
    public static void main(String[] args) {
        Comparison comparison = (a, b) -> {
            if (a < b) {
                return a;
            } else if (a > b) {
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(comparison.comparisonOfNums(15, 15));
    }
}
