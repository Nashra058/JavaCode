import java.util.Scanner;
public class Calculator {
    float num1,num2;
    Calculator(float a, float b){
    this.num1 = a;
    this.num2 = b; 
    }
        
    void addition(){
        System.out.println("Addition of two numbers is : "+(num1+num2));
    }
    void subtraction(){
        System.out.println("Subtraction of two numbers is : "+(num1-num2));
        }
        void multiplication(){
            System.out.println("Multiplication of two numbers is : "+(num1*num2));
            }
            void division(){
                System.out.println("Division of two number is: " + (num1/num2));
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number:- ");
                float a = sc.nextFloat();
                Calculator c = new Calculator(a,4);
                c.addition();
                c.subtraction();
                c.multiplication();
                c.division();
                sc.close();
}
}
