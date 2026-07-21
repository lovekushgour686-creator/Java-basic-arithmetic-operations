/*5. Swap Two Numbers
Question

Write a Java program to swap two numbers without a third variable.

Example

Before:

a = 10
b = 20

After:

a = 20
b = 10 */
public class program05 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping Two Varible ::--->");
        System.out.println("A->" + a);
        System.out.println("B->" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping Two Varible ::--->");
        System.out.println("A->" + a);
        System.out.println("B->" + b);
    }

};
