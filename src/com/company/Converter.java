package com.company;

import java.util.Scanner;

public class Converter {
    Scanner scanner = new Scanner(System.in);

    private String unit1; //= scanner.next();
    private String unit2; //= scanner.next();
    private double number; //= scanner.nextInt();

    public String getUnit1() {
        return unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public double getNumber() {
        return number;
    }

    public double chooseNumber() {
        number = scanner.nextDouble();
        return number;
    }

    public String chooseUnit1 () {
        unit1 = scanner.next();
        return unit1;
    }

    public double convertNumber () {
        unit2 = scanner.next();
        if (unit2.equalsIgnoreCase("g") && unit1.equalsIgnoreCase("kg")) {
            number = number * 1000;
        }
        else if (unit2.equalsIgnoreCase("g") && unit1.equalsIgnoreCase("mg")) {
            number = number / 1000;
        }
        else if (unit2.equalsIgnoreCase("kg") && unit1.equalsIgnoreCase("g")) {
            number = number / 1000;
        }
        else if (unit2.equalsIgnoreCase("kg") && unit1.equalsIgnoreCase("mg")) {
            number = number * 1000000;
        }
        else if (unit2.equalsIgnoreCase("mg") && unit1.equalsIgnoreCase("kg")) {
            number = number * 1000000;
        }
        else if (unit2.equalsIgnoreCase("mg") && unit1.equalsIgnoreCase("g")) {
            number = number * 1000;
        }
        else if (unit2.equalsIgnoreCase("mg") && unit1.equalsIgnoreCase("tons")) {
            number = number * 1000000000;
        }
        else if (unit2.equalsIgnoreCase("g") && unit1.equalsIgnoreCase("tons")) {
            number = number * 1000000;
        }
        else if (unit2.equalsIgnoreCase("kg") && unit1.equalsIgnoreCase("tons")) {
            number = number * 1000;
        }
        else if (unit2.equalsIgnoreCase("tons") && unit1.equalsIgnoreCase("mg")) {
            number = number / 1000000000;
        }
        else if (unit2.equalsIgnoreCase("tons") && unit1.equalsIgnoreCase("g")) {
            number = number / 1000000;
        }
        else if (unit2.equalsIgnoreCase("tons ") && unit1.equalsIgnoreCase("kg")) {
            number = number / 1000;
        }
        else if (unit2.equalsIgnoreCase("km") && unit1.equalsIgnoreCase("m")) {
            number = number / 1000;
        }
        else if (unit2.equalsIgnoreCase("km") && unit1.equalsIgnoreCase("cm")) {
            number = number / 100000;
        }
        else if (unit2.equalsIgnoreCase("km") && unit1.equalsIgnoreCase("mm")) {
            number = number / 1000000;
        }
        else if (unit2.equalsIgnoreCase("m") && unit1.equalsIgnoreCase("mm")) {
            number = number / 1000;
        }
        else if (unit2.equalsIgnoreCase("m") && unit1.equalsIgnoreCase("cm")) {
            number = number / 100;
        }
        else if (unit2.equalsIgnoreCase("m") && unit1.equalsIgnoreCase("km")) {
            number = number * 1000;
        }
        else if (unit2.equalsIgnoreCase("cm") && unit1.equalsIgnoreCase("mm")) {
            number = number / 10;
        }
        else if (unit2.equalsIgnoreCase("cm") && unit1.equalsIgnoreCase("m")) {
            number = number * 100;
        }
        else if (unit2.equalsIgnoreCase("cm") && unit1.equalsIgnoreCase("km")) {
            number = number * 100000;
        }
        else if (unit2.equalsIgnoreCase("mm") && unit1.equalsIgnoreCase("cm")) {
            number = number * 10;
        }
        else if (unit2.equalsIgnoreCase("mm") && unit1.equalsIgnoreCase("m")) {
            number = number * 1000;
        }
        else if (unit2.equalsIgnoreCase("mm") && unit1.equalsIgnoreCase("km")) {
            number = number * 1000000;
        }
        else if (unit2.equalsIgnoreCase("mm") && unit1.equalsIgnoreCase("dm")) {
            number = number * 100;
        }
        else if (unit2.equalsIgnoreCase("cm") && unit1.equalsIgnoreCase("dm")) {
            number = number * 10;
        }
        else if (unit2.equalsIgnoreCase("m") && unit1.equalsIgnoreCase("dm")) {
            number = number / 10;
        }
        else if (unit2.equalsIgnoreCase("km") && unit1.equalsIgnoreCase("dm")) {
            number = number / 10000;
        }
        else if (unit2.equalsIgnoreCase("dm") && unit1.equalsIgnoreCase("mm")) {
            number = number / 100;
        }
        else if (unit2.equalsIgnoreCase("dm") && unit1.equalsIgnoreCase("cm")) {
            number = number / 10;
        }
        else if (unit2.equalsIgnoreCase("dm") && unit1.equalsIgnoreCase("m")) {
            number = number * 10;
        }
        else if (unit2.equalsIgnoreCase("dm") && unit1.equalsIgnoreCase("km")) {
            number = number * 10000;
        }
        //SAFEGUARD
        else if (unit2.equalsIgnoreCase(unit1)) {
            number = number;
            System.out.println("You choose the same unit.");
        }
        //SAFEGUARD
        else {
            number = number;
            System.out.println("ERROR");
            System.out.println("Something went wrong, try again.");
            System.out.println("What number do you want to convert? Use a ',' as the decimal separator.");
            chooseNumber();
            //What unit do you want to choose? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.
            System.out.println("What unit do you want to choose? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.");
            chooseUnit1();
            //To which unit you want to convert? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.
            System.out.println("To which unit you want to convert? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.");
            convertNumber();
            System.out.println(getNumber() + " " + getUnit2());
            System.out.println("You converted " + getUnit1() + " to " + getUnit2());
        }
         return number;
    }
}
// odpowiada kilka razy po ponownym zapytaniu