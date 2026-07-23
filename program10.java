/*Celsius to Fahrenheit
Question

Write a Java program to convert Celsius temperature into Fahrenheit. */

import java.util.Scanner;

public class program10 {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        double c;
        System.out.println("Write celsius to convert in fahrenheit :::--->");

        c = cin.nextDouble();
        double f = (c * 1.8) + 32;
        double cl = (5*(f-32))/9;
        System.out.println("Fahrenheit => " + f);
         System.out.println("Celsius => " + cl);
    cin.close();}

}
