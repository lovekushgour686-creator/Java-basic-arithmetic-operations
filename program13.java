import java.util.Scanner;

public class program13 {
     public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        int n;
        int i = 0;
        System.out.println("Enter how many subject to find avg: ---->");
        n = cin.nextInt();

        double a[] = new double[n];
        System.out.println("Write > marks : ------>");
        for ( i = 0; i < n; i++) {
            a[i] = cin.nextDouble();
        }
    

        for( i= 2 ;i<=n;i++)
        {
               if( a[i]==0 || a[i]==1)
{
    System.out.println("Not prime num");
}
            if(n%i==0)
            {
                break;
            }

        }
     if(i==n)
        {
            System.out.println("Prime num");
        }   
        else {
            System.out.println("not prime");
        }
        cin.close();
    }
}
