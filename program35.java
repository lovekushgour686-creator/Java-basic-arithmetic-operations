
import java.util.Scanner;

/*Given an array arr[] of size n containing non-negative integers, return the rightmost non-zero digit in the product of all array elements. If there is no rightmost non-zero digit, return -1.

Examples:

Input: arr[] = [3, 23, 30, 45]
Output: 5
Explanation: Product of these numbers are 93150, rightmost non-zero digit is 5.
Input: arr[] = [1, 2, 3, 4, 5]
Output: 2
Explanation: Product of these numbers are 120, rightmost non-zero digit is 2.*/
public class program35 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];

        System.out.println("Write in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        long p = 1;

        for (int x : arr) {
            if (x == 0) {
                System.out.println(-1);
            }

            p *= x;

            while (p % 10 == 0) {
                p /= 10;
            }
            p %= 1000000;

        }

        System.out.println("Rightmost :: " + (int) p % 10);
        cin.close();

    }
}
