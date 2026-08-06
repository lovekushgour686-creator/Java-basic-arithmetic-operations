import java.util.Scanner;

/*Given a positive integer n, return true if it is a perfect square, otherwise return false. A number is called a perfect square if it can be written in the form a × a, where a is an integer.

Examples:

Input: n = 35
Output: false 
Explanation: 35 is not a perfect square.
Input: n = 49
Output: true
Explanation: 49 is a perfect square (7 * 7 = 49). */
public class program31 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num Limit:: ");
        int num = cin.nextInt();
        boolean r = false;

        for (int i = 1; i * i <= num; i++) {
            if (num == Math.powExact(i, 2)) {
                r = true;
                break;
            }
        }
        if (r) {
            System.out.println(r);
        } else {
            System.out.println(r);
        }
        cin.close();
    }
}
