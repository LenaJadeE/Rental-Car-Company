package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class RentalCarCompany {
    public static void main(String[] args) {
        customerRentalInfo();

    }

        public static void customerRentalInfo() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String customerName = scanner.nextLine();

            System.out.println("Your current age: ");
            int customerAge = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Pickup date: ");
            String pickupDate = scanner.nextLine();

            System.out.println("Number of days: ");
            int days = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Electronic toll tag (3.95/day)? (yes/no): ");
            String tollAnswer = scanner.nextLine();

            System.out.println("GPS ($2.95/days)? (yes/no): ");
            String gpsAnswer = scanner.nextLine();

            System.out.println("Roadside assistance (3.95/day)? (yes/no): ");
            String roadsideAssistance = scanner.nextLine();

            formatCustomerInfo ( customerName, customerAge, pickupDate, days,
                    tollAnswer, gpsAnswer, roadsideAssistance);
        }

        public static void formatCustomerInfo(String name, int age, String date, int days,
                                          String toll, String gps, String roadside){

            double dailyRate = 29.99;
            double tollTagRate = 3.95;
            double gpsRate = 2.95;
            double roadsideRate = 3.95;
            double underageSurchargeRate = 0.30;
            int underageLimit = 25;

            boolean wantToll = toll.equalsIgnoreCase("yes");
            boolean wantsGps = gps.equalsIgnoreCase("yes");
            boolean wantsRoadside = roadside.equalsIgnoreCase("yes");

            double basicRental = days * dailyRate;

            double dailyOptions = 0;
            if (wantToll) dailyOptions += tollTagRate;
            if (wantsGps) dailyOptions += gpsRate;
            if (wantsRoadside) dailyOptions += roadsideRate;
            double optionsCost = days * dailyOptions;

            double surcharge = 0;
            if (age < underageLimit) {
                surcharge = basicRental * underageSurchargeRate;
        }

        double totalCost = basicRental + optionsCost + surcharge;

        System.out.println();
        System.out.println("Hello " + name);
        System.out.println("Pickup date: " + date + " -- " + days + " day rental");
        System.out.printf("Basic car rental: $%.2f", basicRental);
        System.out.printf("Options cost: $%.2f");
        System.out.printf("Underage surcharge: $%.2f");
        System.out.printf("Total cost: $%.2f");

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
