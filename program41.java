/*Given a number n, find out whether this number is a Smith number or not. A Smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factorization.

Examples:

Input: n = 648
Output: true
Explanation: 648 = 23*34, 6+4+8 = 2+2+2+3+3+3+3. And 648 is composite.
Input: n = 762
Output: true
Explanation: 762 = 21*31*1271 is a Smith number because 7+6+2 = 2+3+(1+2+7) is composite. */

import java.util.Scanner;

public class program41 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();
        int sum = 0;
        int org = num;
        int s = 0;
        while (org > 0) {
            s += + (org % 10);
            org /= 10;

        }
        System.out.println(s);

        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }
        for (int i = 3; i * i <= num; i++) {

            while (num % i == 0) {
                sum += i;
                num /= i;
            }
        }
        if (num > 2) {
            sum += num;
        }
        if (s == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
        cin.close();
    }
}