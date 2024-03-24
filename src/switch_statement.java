import java.util.Scanner;

public class switch_statement {

    public static void main(String[] args) {

//        int day = 2;
        Scanner week = new Scanner(System.in);
        System.out.print("Input a day number (Must be 1-7) : ");
        int day = week.nextInt();

        String day_name;

        switch (day){

            case 1 : day_name = "Sunday";
                System.out.println(day_name);
                break;

            case 2 : day_name = "Monday";
                System.out.println(day_name);
                break;

            case 3 : day_name = "Tuesday";
                System.out.println(day_name);
                break;

            case 4 : day_name = "Wednesday";
                System.out.println(day_name);
                break;

            case 5 : day_name = "Thursday";
                System.out.println(day_name);
                break;

            case 6 : day_name = "Friday";
                System.out.println(day_name);
                break;

            case 7 : day_name = "Saturday";
                System.out.println(day_name);
                break;

            default:
                System.out.println("Invalid number");

        }

    }

}
