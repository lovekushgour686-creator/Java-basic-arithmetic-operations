import java.util.Scanner;

/*Given a natural number n, calculate sum of all its proper divisors. A proper divisor of a natural number is the divisor that is strictly less than the number.

Examples:

Input: n = 10
Output: 8 
Explanation: Proper divisors 1 + 2 + 5 = 8. 
Input: n = 6
Output: 6
Explanation: Proper divisors 1 + 2 + 3 = 6.  */
public class program44 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int n = cin.nextInt();
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
           
            if (n % i == 0) {
                sum += i;
                System.out.println(i);
                if (i != (n / i)) {
                    if((n/i)==n)
                    {
                        continue;
                    }
                    sum += (n / i);
                    System.out.println((n / i));
                }
            }
        }
        System.out.println("sum of its divisors :: " + sum);
        cin.close();
    }
}
