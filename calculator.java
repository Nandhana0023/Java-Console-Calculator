import java.util.InputMismatchException;
import java.util.Scanner;
public class calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static double power(int a, int b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("------Java Console Calculator------");
        int choice;
        while(true){
            try{
            System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Modulus\n6.Power\n7.Exit\nChoose an operation: ");
            choice = z.nextInt();
            if(choice == 7){
                System.out.println("Exiting the calculator! Thank you!");
                break;
            }
        }catch(InputMismatchException e){
                System.out.println("Invalid input, Please enter integers only!");
                z.nextLine();
                continue;
            }
            int num1 = 0;
            int num2 = 0;
            try{
            System.out.print("Enter the first number: ");
            num1 = z.nextInt();
            System.out.print("Enter the second number: ");
            num2 = z.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid input, Please enter integers only!");
                z.nextLine();
                continue;
            }
            switch(choice){
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                   System.out.println("Result: " + multiply(num1, num2));
                   break;
                case 4:
                    if(num2 != 0){
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Result: " + "Error! Can't divide by zero.");
                    }
                    break;
                case 5:
                if(num2 != 0){
                        System.out.println("Result: " + modulus(num1, num2));
                    } else {
                        System.out.println("Result: " + "Error! Can't divide by zero.");
                    }
                    break;
                case 6:
                    System.out.println("Result: " + power(num1, num2));
                    break;    
                default:
                    System.out.println("Invalid choice!");       
            }
        }
        z.close();
    }
}
