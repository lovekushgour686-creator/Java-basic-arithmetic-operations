import java.util.Scanner;

/*Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array. 
Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

Examples:

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: For array [1, 2, 3, 4], the element to be searched is 3. Since 3 is present at index 2, the output is 2. */
public class program16 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size :: ");
        int n = cin.nextInt();
        System.out.println("Enter Key :: ");
        int k = cin.nextInt();
        int r = -1;

        int arr[] = new int[n];
        System.out.println("Write in array :: ");
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                r = i;
            }
        }
        System.out.println("-->" + r);
        cin.close();

    }
}