/*You are given an integer n. You need to convert all zeroes of n to 5.

Examples:

Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.*/

import java.util.Scanner;

public class program36 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter n :: ");
        int n = cin.nextInt();
        int rev = 0;
        int N = 0;
        int s = 0;
        if (n == 0) {
            System.out.println("5");
        }
        while (n > 0) {
            rev = (n % 10);
            if (rev == 0) {
                N = (N * 10) + 5;
            } else {
                N = (N * 10) + rev;
            }
            n /= 10;
        }
        while (N > 0) {
            s = (s * 10) + (N % 10);
            N /= 10;
        }
        System.out.println(s);
        cin.close();
    }
}
