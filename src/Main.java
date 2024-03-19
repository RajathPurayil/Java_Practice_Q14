import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Write a program that prompts the user to enter the distance to
        drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
        and displays the cost of the trip. */

        // Creating the Scanner object

        Scanner input = new Scanner(System.in);


        //Prompting user to Enter the distance to drive

        System.out.println("Enter the  distance to  Drive");
        double distance = input.nextDouble();

        System.out.println("Enter the miles per Gallon");
        double miles_per_Gallon =input.nextDouble();
        System.out.println("Enter the Price per gallon");
        double price_per_gallon =input.nextDouble();

        //Compute cost of Driving

        double costOfDriving = (distance / miles_per_Gallon) * price_per_gallon;

        // Display result
        System.out.println("The cost of driving is $" + costOfDriving);














    }
}