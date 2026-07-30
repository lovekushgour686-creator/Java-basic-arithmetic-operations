/*You are given an integer n. Your task is to determine whether it is a palindrome.
A number is considered a palindrome if it reads the same backward as forward, as the number examples "12121" or "555".

Examples:

Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.
Input: n = -121
Output: true
Explanation: if number is palindrome, mainly ignore sign. */

import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num for checking palindrome or not :: ");
        int n = cin.nextInt();

        n = Math.abs(n);
        int org = n;

        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        n = org;
        if (rev == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        cin.close();
    }
}
