
/*Positive or Negative Number
Question

Write a Java program to check whether a number is positive, negative, or zero. */
import java.util.Scanner;

public class program07 {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.println("Enter integer check wheater it is positive || zero || Negative ::->");
        n = cin.nextInt();

        if (n == 0) {
            System.out.println("*Zero number");
        } else if (n < 0) {
            System.out.println("*Negative number");
        } else {
            System.out.println("*Positive number ");
        }
        cin.close();
    }
}
