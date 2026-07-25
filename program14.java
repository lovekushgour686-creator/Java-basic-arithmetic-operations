import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int s = cin.nextInt();
        int arr[] = new int[s];
        System.out.println("Write in array :: ");
        for (int i = 0; i < s; i++) {
            arr[i] = cin.nextInt();
        }
        boolean r = false;
        System.out.println("Enter key :: ");
        int k = cin.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                r = true;
                break;
            }
        }
        System.out.print("Result :: ");
        if (r) {
            System.out.println("Key found");
        } else {
            System.out.println("Not found");
        }
        cin.close();
    }
}
