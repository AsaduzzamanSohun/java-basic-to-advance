package java_OOP_object_oriented_programming;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.doAddition(5, 4));
        System.out.println(calculator.doSubtraction(7, 3));
        System.out.println(calculator.doMultiplication(10,6));
        System.out.println(calculator.doDivision(24, 6));
        System.out.println(calculator.max(13, 81));

    }

}
