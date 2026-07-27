import java.util.Scanner;

/* Count digits ; */
public class program17 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter integer ::");
        int n = cin.nextInt();
        int org = n;
        int count = 0;
        if (n == 0) {
            System.out.println("Count-->" + "1");
        }
        while (n > 0) {
            count++;
            n = n / 10;

        }
        if (org != 0)
            System.out.println("Count-->" + count);
        cin.close();
    }
}
