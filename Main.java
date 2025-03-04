import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        float a = scn.nextInt();
        System.out.print("Enter second number :- ");
        float b = scn.nextInt();
        System.out.println("Sum: "+ (a + b));
        System.out.println("Difference: "+ (a - b));
        System.out.println("Product: "+ (a * b));
        System.out.println("Divide: " + (a/b));
        scn.close();
    }
}