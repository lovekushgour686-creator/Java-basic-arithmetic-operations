import java.util.Scanner;

/*You are given a number n. Your task is to find n-th Tribonacci Number Tn.
Tribonacci Number:  T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Examples :

Input: 4
Output: 4
Explanation: T3 = 0 + 1 + 1 = 2, T4 = 1 + 1 + 2 = 4
Input: n = 25
Output: 1389537
Input: n = 10
Output: 149 */
public class program33 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter nth :: ");
        int n = cin.nextInt();
        int i = 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int d;

        while (i <= n) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            i++;

        }

        System.out.println("Tribonacci Serice --- >" + a);
        cin.close();
    }
}
