import java.util.ArrayList;
import java.util.Scanner;

/*Given two integers n and d. Return an array containing all the numbers between 0 to n that contain the specific digit d.

Examples:

Input: n = 20, d = 5
Output: [5, 15]
Explanation: For number till 20, 5 appears in 5 itself and 15.
Input: n = 50, d = 2
Output: [2, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32, 42]
Explanation: For number till 50, 2 appears in all these numbers. */
public class program38 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter num :: ");
        int n = cin.nextInt();
        System.out.println("Enter d :: ");
        int d = cin.nextInt();

        for (int i = 0; i <= n; i++) {
            int j = i;
            if (j == d) {
                List.add(i);
                continue;

            }

            while ((j > 0)) {
                if (j % 10 == d) {
                    List.add(i);
                    break;
                }
                j /= 10;

            }

        }
        System.out.println(List);
        cin.close();

    }
}
