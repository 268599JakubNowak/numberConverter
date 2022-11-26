package com.company;

public class Main {

    public static void main(String[] args) {
        // MASS CONVERTER
        while (true) {
            Converter converter = new Converter();
            //  converter.addConversion();
            //What number do you want to convert?
            converter.basicOrSpecial();
            System.out.println("What number do you want to convert? Use a ',' as the decimal separator.");
            converter.chooseNumber();
            System.out.println("What unit do you want to choose?");
            converter.chooseUnit1();
            System.out.println("To which unit you want to convert?");
            converter.convertNumber();
            System.out.println(converter.getNumber() + " " + converter.getUnit2());
            System.out.println("You converted " + converter.getUnit1() + " to " + converter.getUnit2());
        }
    }
}
