/*You are given a positive integer n, return its prime factors in any order.  A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

Examples:

Input: n = 18 
Output: [2, 3, 3]
Explanation: Prime Factorization of 18 is 2 * 32.
Input: n = 25
Output: [5, 5]
Explanation: Prime Factorization of 25 is 52. */

import java.util.ArrayList;
import java.util.Scanner;

public class program39 {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter num :: ");
        int num = cin.nextInt();

        while (num % 2 == 0) {
            List.add(2);
            num /= 2;

        }
        for (int i = 3; i * i <= num; i++) {
            while (num % i == 0) {
                List.add(i);
                num /= i;
            }
        }

        if (num > 2) {
            List.add(num);
        }

        System.out.println(List);
        cin.close();
    }
}
