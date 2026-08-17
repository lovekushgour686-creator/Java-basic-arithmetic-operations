import java.util.Scanner;

public class program40 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter num :: ");
        int num = cin.nextInt();
        int count = 0;

        for (int i = 2; i <= num; i++) {
            boolean r = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    r = false;
                    break;
                }

            }
            if (r) {
                count++;
            }
        }
        System.out.println(count);
        cin.close();
    }

}