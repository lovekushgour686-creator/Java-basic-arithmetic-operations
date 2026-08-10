import java.util.Scanner;

/*Given a number n, find if it is Disarium or not.

A number is called a Disarium number if the sum of its digits raised to the power of their respective positions is equal to the number itself.

Examples:

Input: 89
Output: true
Explanation: 81 + 92 = 8 + 81 = 89, which is equal to n. Therefore, 89 is a Disarium Number, so output is true.
Input: 81
Output: false
Explanation: 81 + 12 = 8 + 1 = 9, which is not equal to n. Therefore, 81 is not a Disarium Number, so output is false. */
public class program34 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter n th :: ");
        int n = cin.nextInt();
        int count = 0;
        int sum = 0;
        int org = n;
        int r = 0;

        while (n > 0) {
            count++;
            n /= 10;

        }
        System.out.println(count);
        n = org;

        while (n > 0) {
            r = n % 10;
            sum += Math.powExact(r, count);
            count--;
            n /= 10;
        }
        System.out.println(sum);
        n = org;
        if (sum == n) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
        cin.close();
    }
}