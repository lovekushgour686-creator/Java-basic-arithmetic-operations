import java.util.ArrayList;
import java.util.Scanner;

// check Perfect cube ; 
/* 
start a = x element;
end  b = y element;

find cube between start to end;

*/
public class program32 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter a :: ");
        int a = cin.nextInt();
        System.out.println("Enter b :: ");
        int b = cin.nextInt();
        for (int i = a; i <= b; i++) {
            int cubeRoot = (int) Math.cbrt(i);
            if (Math.powExact(cubeRoot, 3) == i) {
                List.add(i);
            }

        }
        System.out.println(List);
        cin.close();
    }
}
