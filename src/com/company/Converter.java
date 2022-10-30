package com.company;

import java.util.Scanner;

public class Converter {
    String unit1;
    String unit2;
    double number;


    public String getUnit1() {
        return unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public double getNumber() {
        return number;
    }

    public double chooseNumber(double number) {
        this.number = number;
        return number;
    }

    public String chooseUnit (String unit1) {
        this.unit1 = unit1;
        return unit1;
    }

    public double convertNumber (String unit2) {
        this.unit2 = unit2;
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
        else {
            number = number;
            System.out.println("ERROR");
        }
         return number;
    }
}
