//package by.overone.lesson18;
//
//import by.overone.Math;
//
//public class Solution <T extends ClassForGenerics & InterfaceForGenerics> {
//    private T num1;
//    private T num2;
//    private T sum;
//
//    public Solution() {
//    }
//
//    public T getNum1() {
//        return num1;
//    }
//
//    public void getNum1(T num1) {
//        this.num1 = num1;
//    }
//
//    public T getNum2() {
//        return num2;
//    }
//
//    public void setNum2(T num2) {
//        this.num2 = num2;
//    }
//
//    public static <T extends Number> Number sum( number) {
//        T num1 = number.getNum1();
//        T num2 = number.getNum2();
////        if (num1 instanceof Integer) {
////            return num1.intValue() + num2.intValue();
////        } else if (num1 instanceof Double) {
////            return num1.doubleValue() + num2.doubleValue();
////        } else {
////            return num1.floatValue() + num2.floatValue();
////        }
////    }
///