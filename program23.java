import java.util.Scanner;

/*Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12 */
public class program23 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter first -->");
        int f = cin.nextInt();
        System.out.println("Enter second -->");
        int s = cin.nextInt();
        int GCD = 1;
        for (int i = 2; i <= Math.min(f, s); i++) {
            if (f % i == 0 && s % i == 0) {
                GCD = i;
            }

        }
        System.out.println("GCD-->"+GCD);
        cin.close();
    }
}
// Not optimize it show Time Limit Execed ;