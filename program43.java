import java.util.Scanner;

/*Find the number of factors for a given integer n.

 Examples:

Input: n = 5
Output: 2
Explanation: 5 has 2 factors 1 and 5
Input: n = 25
Output: 3
Explanation: 25 has 3 factors 1, 5, 25  */
public class program43 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: (find factor)-> ");
        int num = cin.nextInt();
        int count = 0;
	for (int i = 1; i <= num/2; i++) {
			if ((num % i) == 0) {
				
				count++;
			}
			if((num%(num+1-i))==0)
			{
			    count ++;
			}
		}
        System.out.println("Factors count :: "+count);
        cin.close();
    }
};
