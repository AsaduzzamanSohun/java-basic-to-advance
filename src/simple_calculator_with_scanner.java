import java.util.Scanner;

public class simple_calculator_with_scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();

        double addition = a+b;
        double subtraction = a-b;
        double multiplication = a*b;
        double division = a/b;

        System.out.println("Addition: "+ addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        Scanner text = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = text.nextLine();
        System.out.println("Welcome to java " + name);

    }

}
