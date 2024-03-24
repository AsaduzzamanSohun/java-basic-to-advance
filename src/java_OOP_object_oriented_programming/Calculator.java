package java_OOP_object_oriented_programming;

public class Calculator {

    int a;
    int b;

    int doAddition(int a, int b){
        return a + b;
    }

    int doSubtraction(int a, int b){
        return a - b;
    }

    int doMultiplication(int a, int b){
        return a * b;
    }

    int doDivision(int a, int b){
        return a / b;
    }

    int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
}
