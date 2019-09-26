/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.lang.Math;
import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter your first name:");
         String firstName = in.nextLine();

         System.out.print("Enter your last name:");
         String lastName = in.nextLine();

         System.out.print("Enter your grade:");
         int grade = in.nextInt();
         in.nextLine();

         System.out.print("Enter your age:");
         int age = in.nextInt();
         in.nextLine();

         System.out.print("Enter your hometown:");
         String hometown = in.nextLine();

         System.out.println("\nNAME \t : " + firstName + " " + lastName);
         System.out.println("GRADE \t : " + grade);
         System.out.println("AGE \t : " + age);
         System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         System.out.print("\nEnter a dollar amount:");
         double initialMoney = in.nextDouble();
         in.nextLine();

         final int dollarValue = 1;
         final double quarterValue = .25;
         final double dimeValue = .10;
         final double nickelValue = .05;
         final double pennyValue = .01;
         double dollarBills;
         double quarters;
         double dimes;
         double nickels;
         double pennies;
         double remainingMoney;

         dollarBills = Math.floor(initialMoney / dollarValue);
         remainingMoney = initialMoney % dollarValue;

         quarters = Math.floor(remainingMoney / quarterValue);
         remainingMoney %= quarterValue;

         dimes = Math.floor(remainingMoney / dimeValue);
         remainingMoney %= dimeValue;

         nickels = Math.floor(remainingMoney / nickelValue);
         remainingMoney %= nickelValue;
         pennies = Math.floor(remainingMoney / pennyValue);

         System.out.printf("%s %.0f", "\nDOLLARS : ", dollarBills);
         System.out.printf("%s %.0f", "\nQUARTERS: ", quarters);
         System.out.printf("%s %.0f", "\nDIMES \t: ", dimes);
         System.out.printf("%s %.0f", "\nNICKELS : ", nickels);
         System.out.printf("%s %.0f", "\nPENNIES : ", pennies);


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter a dollar amount:");
         initialMoney = in.nextDouble(); //variable from Ex 2
         in.nextLine();

         final int tenDollarValue = 10;
         final int fiveDollarValue = 5;
         double tenDollarBills;
         double fiveDollarBills;
         //Dollar, quarter, dime, nickel, and penny value and storage from above.

         tenDollarBills = Math.floor(initialMoney / tenDollarValue);
         remainingMoney = initialMoney % tenDollarValue;

         fiveDollarBills = Math.floor(remainingMoney / fiveDollarValue);
         remainingMoney %= fiveDollarValue;

         dollarBills = Math.floor(remainingMoney / dollarValue);
         remainingMoney %= dollarValue;

         quarters = Math.floor(remainingMoney / quarterValue);
         remainingMoney %= quarterValue;

         dimes = Math.floor(remainingMoney / dimeValue);
         remainingMoney %= dimeValue;

         nickels = Math.floor(remainingMoney / nickelValue);
         remainingMoney %= nickelValue;
         pennies = Math.floor(remainingMoney / pennyValue);

         double billCount = tenDollarBills + fiveDollarBills + dollarBills;
         double coinCount = quarters + dimes + nickels + pennies;

         System.out.printf("%s %.0f", "\nBILLS\t: ", billCount);
         System.out.printf("%s %.0f", "\nCOINS\t: ", coinCount);


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter a number of inches:");
         double inches = in.nextDouble();
         in.nextLine();

         final int inchesPerMile = 63360;
         final int inchesPerYard = 36;
         final int inchesPerFoot = 12;

         double miles;
         double yards;
         double feet;

         miles = Math.floor(inches / inchesPerMile);
         inches %= inchesPerMile;

         yards = Math.floor(inches / inchesPerYard);
         inches %= inchesPerYard;

         feet = Math.floor(inches / inchesPerFoot);
         inches %= inchesPerFoot;

         System.out.printf("%s %.0f", "\nMILES\t:", miles);
         System.out.printf("%s %.0f", "\nYARDS\t:", yards);
         System.out.printf("%s %.0f", "\nFEET \t:", feet);
         System.out.printf("%s %.0f", "\nINCHES\t:", inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         System.out.print("\nEnter a number of centimeters:");
         double centimeters = in.nextDouble();
         in.nextLine();

         final int centimetersPerKilometers = 1000;
         final int centimetersPerMeters= 100;

         double kilometers;
         double meters;

         kilometers = Math.floor(centimeters / centimetersPerKilometers);
         centimeters %= centimetersPerKilometers;

         meters = Math.floor(centimeters / centimetersPerMeters);
         centimeters %= centimetersPerMeters;


         System.out.printf("%s %.0f", "\nKILOMETERS :", kilometers);
         System.out.printf("%s %.0f", "\nMETERS\t   :", meters);
         System.out.printf("%s %.0f", "\nCENTIMETERS:", centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
