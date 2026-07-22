/*8. Largest of Two Numbers
Question

Write a Java program to find the largest of two numbers. */

import java.util.Scanner;

public class program08 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int f, s;
        System.out.println("Enter two integer :::---->");
        f = cin.nextInt();
        s = cin.nextInt();

        if (f > s)
            System.out.println(f + " Is Largest integer");
        else
            System.out.println(s + " Is Largest integer");
    cin.close();
    }
    

}
