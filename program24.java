import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter first :: ");
        int a = cin.nextInt();
        System.out.println("Enter second ::");
        int b = cin.nextInt();
        while (b != 0) {
            int t = b;
            b = a % b; // Euclidean Algorithm ; fastest way to find GCD ;
            a = t;

        }
        System.out.println("GCD -->" +  a);
        cin.close();
    }
}
// optimize form ;