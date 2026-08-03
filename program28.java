import java.util.Scanner;


/*Given an integer n. The task is to calculate the sum of the squares of the first  n natural numbers.

Examples:

Input: n = 2
Output: 5
Explanation: 12 + 22 = 5
Input: n = 3
Output: 14
Explanation: 12 + 22 + 32 = 14 */
public class program28 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the num :: ");
        int num = cin.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Math.powExact(i, 2);
        }
        System.out.println(sum);
        cin.close();
    }
}
