import java.util.Scanner;

public class java_condition {

    public static void main(String[] args) {

        Scanner negative_or_positive = new Scanner(System.in);
        Scanner quadratic = new Scanner(System.in);
        Scanner leapYear = new Scanner(System.in);

//        --------------- negative or positive -------------------
        System.out.print("Input a number: ");
        int num = negative_or_positive.nextInt();
        if(num >= 0){
            System.out.println(num + " : Positive");
        }else {
            System.out.println(num + " : Negative");
        }

//        ----------------- quadratic equation -----------------
        System.out.print("a: ");
        double a = quadratic.nextDouble();
        System.out.print("b: ");
        double b = quadratic.nextDouble();
        System.out.print("c: ");
        double c = quadratic.nextDouble();

        double result = b*b - 4*a*c;

        if(result > 0.0){

            double r1 = (-b + Math.pow(result, 0.5))/(2*a);
            double r2 = (-b - Math.pow(result, 0.5))/(2*a);
            System.out.println("The roots are " + r1 + " and " + r2);

        } else if (result == 0) {

            double r1 = (-b)/(2*a);
            System.out.println("The roots are " + r1);

        }else {
            System.out.println("This equation has not real root");
        }


//        ------------------------ leap year -------------------------
        System.out.print("The year: ");
        int year = leapYear.nextInt();

        if (year % 4 == 0 && year % 400 == 0){
            System.out.println(year + " : This is a leap year");
        }else {
            System.out.println(year + " : This is not a leap year");
        }


    }

}
