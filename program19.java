import java.util.Scanner;

/*Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

Examples:

Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.
Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number. */
public class program19 {
    static boolean checker(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter for checking even or odd :: ");
        int n = cin.nextInt();
        n = Math.abs(n);
        System.out.print("Verification :: ");
        System.out.println(checker(n));
        cin.close();
    }
}
