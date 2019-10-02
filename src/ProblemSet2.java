/*
 * Copyright (c) 2019. UCVTS and its affiliated.
 *
 * All copyright information will be written here. It tells users what is or
 * isn't an acceptable use of your source code. You won't need to include
 * copyright information in your source code, but you should recognize it
 * should you encounter it in someone else's code.
 */

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

         System.out.print("\nEnter your first name: ");
         String firstName = in.nextLine();

         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();

         System.out.print("Enter your grade: ");
         int grade = in.nextInt();
         in.nextLine();

         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();

         System.out.print("Enter your hometown: ");
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

         System.out.print("\nEnter a dollar amount: ");
         double initialMoney = in.nextDouble();
         in.nextLine();

         final int DOLLAR_VALUE = 1;
         final double QUARTER_VALUE = .25;
         final double DIME_VALUE = .10;
         final double NICKEL_VALUE = .05;
         final double PENNY_VALUE = .01;
         double dollarBills;
         double quarters;
         double dimes;
         double nickels;
         double pennies;
         double remainingMoney;

         dollarBills = Math.floor(initialMoney / DOLLAR_VALUE);
         remainingMoney = initialMoney % DOLLAR_VALUE;

         quarters = Math.floor(remainingMoney / QUARTER_VALUE);
         remainingMoney %= QUARTER_VALUE;

         dimes = Math.floor(remainingMoney / DIME_VALUE);
         remainingMoney %= DIME_VALUE;

         nickels = Math.floor(remainingMoney / NICKEL_VALUE);
         remainingMoney %= NICKEL_VALUE;
         pennies = Math.floor(remainingMoney / PENNY_VALUE);

         System.out.printf("%s %.0f", "\nDOLLARS  : ", dollarBills);
         System.out.printf("%s %.0f", "\nQUARTERS : ", quarters);
         System.out.printf("%s %.0f", "\nDIMES \t : ", dimes);
         System.out.printf("%s %.0f", "\nNICKELS  : ", nickels);
         System.out.printf("%s %.0f %s", "\nPENNIES  : ", pennies, "\n");


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         *
         * SOLVED
         *
         */

         System.out.print("\n" + "Enter a dollar amount: ");
         initialMoney = in.nextDouble(); //variable from Ex 2
         in.nextLine();

         final int TWENTY_DOLLAR_VALUE = 20;
         final int TEN_DOLLAR_VALUE = 10;
         final int FIVE_DOLLAR_VALUE = 5;
         double twentyDollarBills;
         double tenDollarBills;
         double fiveDollarBills;
         //Dollar, quarter, dime, nickel, and penny value and storage from above.

         twentyDollarBills = Math.floor(initialMoney / TWENTY_DOLLAR_VALUE);
         remainingMoney = initialMoney % TWENTY_DOLLAR_VALUE;

         tenDollarBills = Math.floor(remainingMoney / TEN_DOLLAR_VALUE);
         remainingMoney %= TEN_DOLLAR_VALUE;

         fiveDollarBills = Math.floor(remainingMoney / FIVE_DOLLAR_VALUE);
         remainingMoney %= FIVE_DOLLAR_VALUE;

         dollarBills = Math.floor(remainingMoney / DOLLAR_VALUE);
         remainingMoney %= DOLLAR_VALUE;

         quarters = Math.floor(remainingMoney / QUARTER_VALUE);
         remainingMoney %= QUARTER_VALUE;

         dimes = Math.floor(remainingMoney / DIME_VALUE);
         remainingMoney %= DIME_VALUE;

         nickels = Math.floor(remainingMoney / NICKEL_VALUE);
         remainingMoney %= NICKEL_VALUE;
         pennies = Math.floor(remainingMoney / PENNY_VALUE);

         double billCount = twentyDollarBills + tenDollarBills + fiveDollarBills + dollarBills;
         double coinCount = quarters + dimes + nickels + pennies;

         System.out.printf("%s %.0f", "\nBILLS : ", billCount);
         System.out.printf("%s %.0f %s", "\nCOINS : ", coinCount, "\n");


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter a number of inches: ");
         double inches = in.nextDouble();
         in.nextLine();

         final int INCHES_PER_MILE = 63360;
         final int INCHES_PER_YARD = 36;
         final int INCHES_PER_FOOT = 12;

         double miles;
         double yards;
         double feet;

         miles = Math.floor(inches / INCHES_PER_MILE);
         inches %= INCHES_PER_MILE;

         yards = Math.floor(inches / INCHES_PER_YARD);
         inches %= INCHES_PER_YARD;

         feet = Math.floor(inches / INCHES_PER_FOOT);
         inches %= INCHES_PER_FOOT;

         System.out.printf("%s %.0f", "\nMILES  :", miles);
         System.out.printf("%s %.0f", "\nYARDS  :", yards);
         System.out.printf("%s %.0f", "\nFEET   :", feet);
         System.out.printf("%s %.0f %s", "\nINCHES :", inches, "\n");

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         System.out.print("\nEnter a number of centimeters: ");
         double centimeters = in.nextDouble();
         in.nextLine();

         final int CENTIMETERS_PER_KILOMETER = 1000;
         final int CENTIMETERS_PER_METER= 100;

         double kilometers;
         double meters;

         kilometers = Math.floor(centimeters / CENTIMETERS_PER_KILOMETER);
         centimeters %= CENTIMETERS_PER_KILOMETER;

         meters = Math.floor(centimeters / CENTIMETERS_PER_METER);
         centimeters %= CENTIMETERS_PER_METER;


         System.out.printf("%s %.0f", "\nKILOMETERS  :", kilometers);
         System.out.printf("%s %.0f", "\nMETERS\t    :", meters);
         System.out.printf("%s %.0f %s", "\nCENTIMETERS :", centimeters, "\n");

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         in.nextLine();

         double areaCircle =  Math.PI * Math.pow((diameter / 2), 2);
         double circumferenceCircle = Math.PI * diameter;

         System.out.printf("%s %.2f", "\nAREA\t     :", areaCircle);
         System.out.printf("%s %.2f %s", "\nCIRCUMFERENCE :", circumferenceCircle, "\n");

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         *
         * SOLVED
         *
         */

         System.out.print("\nEnter a length: ");
         double lengthRectangle = in.nextDouble();
         in.nextLine();

         System.out.print("Enter a width: ");
         double widthRectangle = in.nextDouble();
         in.nextLine();


         double areaRectangle =  lengthRectangle * widthRectangle;
         double perimeterRectangle = (2*lengthRectangle) + (2*widthRectangle);
         double diagonalRectangle = Math.sqrt(Math.pow(lengthRectangle, 2) + Math.pow(widthRectangle, 2));

         System.out.printf("%s %.2f", "\nAREA\t  :", areaRectangle);
         System.out.printf("%s %.2f", "\nPERIMETER :", perimeterRectangle);
         System.out.printf("%s %.2f %s", "\nDIAGONAL  :", diagonalRectangle, "\n");

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double sideLengthHexagon = in.nextDouble();
         in.nextLine();

         double areaHexagon = ((3 * Math.sqrt(3))/2) * Math.pow(sideLengthHexagon, 2);
         double perimeterHexagon = 6 * sideLengthHexagon;

         System.out.printf("%s %.2f", "\nAREA\t  :", areaHexagon);
         System.out.printf("%s %.2f %s", "\nPERIMETER :", perimeterHexagon, "\n");

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

         System.out.print("\nEnter a string: ");
         String initialString = in.nextLine();
         int stringLength = initialString.length();
         int splicePoint = (stringLength / 2); //-1 because index starts at 0
         String firstHalf = initialString.substring(0, splicePoint);
         String secondHalf = initialString.substring(splicePoint);

         System.out.println("\n" + secondHalf + firstHalf + "\n");

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("Enter your first name: ");
         firstName = in.nextLine();
         System.out.print("Enter your middle name: ");
         String middleName = in.nextLine();
         System.out.print("Enter your last name: ");
         lastName = in.nextLine();

         String firstInitial = firstName.substring(0, 1);
         String middleInitial = middleName.substring(0, 1);
         String lastInitial = lastName.substring(0, 1);

         System.out.print("\n" + firstInitial + middleInitial + lastInitial + "\n");
        in.close();
    }
}
