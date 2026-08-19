import java.util.*;

/*A Kaprekar number is a number whose square when divided into two parts the sum of those parts is equal to the original number and none of the parts has value  0. Your task is to check if a given number n is Kaprekar number or not.

Examples:

Input: n = 45
Output: true
Explanation: 45 * 45 = 2025. Now, 20 + 25 = 45. Thus, 45 is a kaprekar number.
Input: n = 20
Output: false
Explanation: 20 * 20 = 400. There is no way to divide 400 into two parts such that their sum is equal to 20. So,20 is not a kaprekar number.
Input: n = 10
Output: false
Explanation: Note that we can write 100 as 10 + 0, but 0 is not allowed in any part.*/
public class program42 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();

        int sq = (int) Math.pow(num, 2);
        int denominetor = 10;

        boolean r = false;
        if (num == 1) {
            r = true;

        }
        while ((sq / denominetor) > 0) {
            int LHS = sq / denominetor;
            int RHS = sq % denominetor;

            if ((LHS > 0 && RHS > 0) && (LHS + RHS == num)) {
                r = true;
                break;
            }
            denominetor *= 10;
        }
        if (r) {
            System.out.println(r);
        } else {
            System.out.println(r);
        }
        cin.close();

    }

}
