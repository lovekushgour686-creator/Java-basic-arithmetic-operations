import java.util.Scanner;

/*Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime. */
public class program12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter for checking prime or not :: ");
        int n = cin.nextInt();
        int i;

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {

                break;
            }
        }
        if (i == n) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
        cin.close();
    }
}
