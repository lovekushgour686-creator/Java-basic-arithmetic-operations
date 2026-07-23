/*Calculate Average
Question

Write a Java program to calculate the average of three numbers. */

import java.util.Scanner;

public class program11 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        int n;
        System.out.println("Enter how many subject to find avg: ---->");
        n = cin.nextInt();

        double a[] = new double[n];
        System.out.println("Write > marks : ------>");
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextDouble();
        }
        double s = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[i];
            d++;
        }

        System.out.println("Avg = >" + s / d);
        cin.close();
    }
}
