import java.util.Scanner;

/*Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Examples:

Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
Input: n = 7
Output: 784
Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784 */
public class program29 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += Math.powExact(i, 3);
            i++;
        }
        System.out.println(sum);
        cin.close();
    }
}
