/*Simple Interest Program
Question

Write a Java program to calculate simple interest. */

import java.util.Scanner;

public class program09 {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        double principle, rate, time;
        // formla => (p*r*t)/100;

        System.out.println("Write principle , rate,time for claculate simple interest =====>");
        principle = cin.nextDouble();
        rate = cin.nextDouble();
        time = cin.nextDouble();

        double si = (principle * rate * time) / 100;
        System.out.println("Simple interest =>" + si);
        cin.close();
    }

}
