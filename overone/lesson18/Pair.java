package by.overone.lesson18;

public class Pair <K, V> {
    private K something;
    private V something2;

    public Pair(){
    }

    public Pair(K something, V something2) {
        this.something = something;
        this.something2 = something2;
    }

    public K getSomething() {
        return something;
    }

    public void setSomething(K something) {
        this.something = something;
    }

    public V getSomething2() {

        return something2;
    }

    public void setSomething2(V something2) {
        this.something2 = something2;
    }
}


