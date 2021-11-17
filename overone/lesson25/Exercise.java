package by.overone.lesson25;

public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        System.out.println(exercise.myMethod());
    }
    String myMethod(){
        Exercise exercise = null;
        try {
            exercise.hashCode();
            return "IDEA try";
        } catch (NullPointerException exception) {
    return "IDEA catch exception";
        }
    }
}
