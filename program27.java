/*Given two integers l and r, find and return all prime numbers in the range [l, r] (inclusive).

Examples:

Input: l = 1, r = 10
Output: [2, 3, 5, 7]
Explanation:
The prime numbers between 1 and 10 are 2, 3, 5 and 7.
Input: l = 2, r = 5
Output: [2, 3, 5]
Explanation:
The prime numbers between 2 and 5 are 2, 3 and 5. */
// OPTIMIZE Form*

import java.util.ArrayList;
import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter Begining num :: ");
        int l = cin.nextInt();
        System.out.println("Enter end num :: ");
        int r = cin.nextInt();

        for (int i = Math.max(2, l); i <= r; i++) {
            boolean c = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    c = false;
                    break;
                }

            }
            if (c) {
                List.add(i);

            }

        }
        System.out.println(List);

        cin.close();
    }
}
