package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args){
        final double dailyRate = 29.99;
        final double tollTagRate = 3.95;
        final double gpsRate = 2.95;
        final double roadsideRate = 3.95;
        final double underageSurchargeRate = 0.30;
        final int underageLimit = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.println("Number of days: ");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Electronic toll tag (3.95/day)? (yes/no) ");













    }
}
// EXERCISE 1
// Step 1
// IMPORTANT: DO NOT just start coding - take time to plan the flow of your application in your notebook.
// Read the requirements below and consider how you would calculate the cost if you did not have a computer.
// Practice several scenarios (with different options) in your notebook before you create your project in IntelliJ.

// Step 2
// Create a Java application named rental-car-calculator that estimates the cost of reserving a rental car.
// Prompt the user for the following information:
// a. pickup date (store as a string)
// b. number of days for the rental
// c. whether they want an electronic toll tag at $3.95/day  (yes/no)
// d. whether they want a GPS at $2.95/day  (yes/no)
// e. whether they want roadside assistance at $3.95/day  (yes/no)
// f. their current age

// Step 3
// Calculate and display:
// a. basic car rental
// b. options cost
// c. underage driver surcharge
// d. total cost
// The basic car rental is $29.99 per day.
// There is a 30% surcharge on the basic car rental for drivers under 25.
// All taxes have already been incorporated into the fees shown.

// Step 4
// 1.  Ensure all your changes are committed and pushed to GitHub
// 2.  Send your repository URL to your Instructor
