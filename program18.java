import java.util.Scanner;

/*For an integer n, find the number of trailing zeroes in n!.

Examples :

Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0. */
public class program18 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num for factorial :: ");
        int n = cin.nextInt();

        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count += n / i;
        }

        System.out.println("--->" + count);
        cin.close();
    }
}
