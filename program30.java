import java.util.Scanner;

/*You are given a number n. You need to find the digital root of n. 
Digital Root of a number is the recursive sum of its digits until we get a single digit number.

Examples :

Input: n = 1
Output:  1
Explanation: Digital root of 1 is 1
Input: n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45 which is not a single digit number,
hence sum of digit of 45 is 9 which is a single digit number. */
public class program30 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int n = cin.nextInt();
        System.out.print("Digit root :: ");
        if (n == 0) {
            System.out.println("0");
            return;
        }
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        int rem = sum % 9;

        if (rem == 0) {
            System.out.println("9");
        } else {
            System.out.println(rem);
        }
        cin.close();
    }
}
