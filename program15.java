import java.util.Scanner;

public class program15 {
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
/*
 * For Input :
 * 10 8 30
 * 6
 * Your Code's output is:
 * 4
 * It's Correct output is:
 * -1
 */