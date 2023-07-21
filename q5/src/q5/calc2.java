package q5;
import java.util.Scanner;
public class calc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Cannot divide by zero!");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator!");
	                break;
	        }

	        scanner.close();
	}

}
