package com.company;

public class Main {

    public static void main(String[] args) {
        // MASS AND LENGTH CONVERTER
        Converter converter = new Converter();
        //What number do you want to convert?
        System.out.println("What number do you want to convert?");
        converter.chooseNumber();
       //What unit do you want to choose? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.
        System.out.println("What unit do you want to choose? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.");
        converter.chooseUnit1();
      //To which unit you want to convert? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.
        System.out.println("To which unit you want to convert? AVAILABLE UNITS: mg, g, kg, tons and mm, cm, dm, m, km.");
        converter.convertNumber();
        System.out.println(converter.getNumber() + " " + converter.getUnit2());
        System.out.println("You converted " + converter.getUnit1() + " to " + converter.getUnit2());
    }
}
