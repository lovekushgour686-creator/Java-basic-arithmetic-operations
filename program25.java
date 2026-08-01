import java.util.Scanner;

public class program25 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter first :: ");
        int a = cin.nextInt();
        System.out.println("Enter second ::");
        int b = cin.nextInt();
        int f = a;
        int s = b;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;

        }
        System.out.println("-->" + (f * s) / a);
        cin.close();
    }
}
