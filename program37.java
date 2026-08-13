/*Your are given a number n . The number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. Return true if number is Spy number, else false.

Examples:

Input: n = 1412
Output: true
Explanation: 
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product, 1412 is Spy number
Input: n = 13
Output: false
Explanation: 
sum = (1 + 3 ) = 4
product = (1 * 3 ) = 3
since, sum != product, 13 is not a Spy number   */

import java.util.Scanner;

/**
 * program37
 */
public class program37 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();

        int s = 0;
        int p = 1;
        while (num > 0) {
            s = s+ (num%10);
            p = p * (num%10);

            num /= 10;
        }
        if(s==p)

    {
        System.out.println("True");
    }else
    {
        System.out.println("False");
    }cin.close();
}}