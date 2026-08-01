import java.util.Arrays;
import java.util.Scanner;

/*You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2. */
public class program26 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);

        if (size == 1) {
            System.out.println("Missing :: " + (arr[0] + 1));
        }
        int c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (c != arr[i]) {
                System.out.println("Missing :: " + c);
                break;
            } else {
                c++;
            }
        }
        cin.close();
    }
}
