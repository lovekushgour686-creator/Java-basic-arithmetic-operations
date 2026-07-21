/*Even or Odd Number
Question

Write a Java program to check whether a number is even or odd. */

import java.util.Scanner;

public class program06 {

    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n;
        System.out.println("Enter intege check wheather it is even or odd ::--->");
        n = cin.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n + " Is Even integer.");

            } else {
                System.out.println(n + " Is Odd integer.");

            }
            n--;
        }

        cin.close();

    }

}