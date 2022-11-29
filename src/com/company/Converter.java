package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Converter {

    Scanner scanner = new Scanner(System.in);

    private String unit1;
    private String unit2;
    private double number;
    private double specialFactor;
    private Map<String, Double> conversionMap;

    public Converter() {
        conversionMap = new HashMap<>();
        addConversion("g", "kg", 0.001);
        addConversion("g", "dg", 0.1);
        addConversion("g", "tons", 0.000001);
        addConversion("g", "mg", 10.0);
        addConversion("kg", "g", 1000.0);
        addConversion("kg", "mg", 1000000.0);
        addConversion("kg", "dg", 100.0);
        addConversion("kg", "tons", 0.001);
        addConversion("dg", "g", 10.0);
        addConversion("dg", "mg", 100.0);
        addConversion("dg", "kg", 0.01);
        addConversion("dg", "tons", 0.00001);
        addConversion("mg", "tons", 0.0000001);
        addConversion("mg", "kg", 0.0001);
        addConversion("mg", "g", 0.1);
        addConversion("mg", "dg", 0.01);
        addConversion("dg", "mg", 100.0);
        addConversion("dg", "g", 10.0);
        addConversion("dg", "kg", 0.01);
        addConversion("dg", "tons", 0.00001);
    }

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

    public String chooseUnit1() {
        unit1 = scanner.next();
        return unit1;
    }
    public void addConversion(String unit1, String unit2, Double factor) {
        conversionMap.put(unit1 + "-" + unit2, factor);

    }
    public void basicOrSpecial() {
        System.out.println("Do you want to create special units? Write yes or no.");
        String yesOrNo = scanner.next();
        if (yesOrNo.equalsIgnoreCase("yes")) {
            System.out.println("What number do you want to convert? Use a ',' as the decimal separator.");
            chooseNumber();
            System.out.println("What unit do you want to choose?");
            chooseUnit1();
            System.out.println("To which unit you want to convert?");
            convertSpecialNumber();
            System.out.println(getNumber() + " " + getUnit2());
            System.out.println("You converted " + getUnit1() + " to " + getUnit2());
        }
        else if (yesOrNo.equalsIgnoreCase("no")) {
            System.out.println("What number do you want to convert? Use a ',' as the decimal separator.");
            chooseNumber();
            System.out.println("What unit do you want to choose?");
            chooseUnit1();
            System.out.println("To which unit you want to convert?");
            convertNumber();
            System.out.println(getNumber() + " " + getUnit2());
            System.out.println("You converted " + getUnit1() + " to " + getUnit2());
        }
        else {
            System.out.println("I don't understand, write again.");
            basicOrSpecial();
        }
    }
    public double convertNumber() {
        unit2 = scanner.next();
        String conversion = unit1 + "-" + unit2;
        if (conversionMap.containsKey(conversion)) {
            double factor = conversionMap.get(conversion);
            number = number * factor;
        } else {
            //nie ma takiej jednostki
            System.out.println("ERROR");
        }
        return number;
    }
    public double convertSpecialNumber() {
        unit2 = scanner.next();
        System.out.println("Enter the conversion factor");
        specialFactor = scanner.nextInt();
        number = number * specialFactor;
        return number;
    }
}