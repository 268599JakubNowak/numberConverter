package com.company;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        //What number do you want to convert?
        converter.chooseNumber(10.34);
       //What unit do you want to choose?
        converter.chooseUnit("kg");
      //To which unit you want to convert?
        converter.convertNumber("g");
        System.out.println(converter.getNumber() + " " + converter.getUnit2());
        System.out.println("You converted " + converter.getUnit1());
        System.out.println("To " + converter.getUnit2());

    }
}
