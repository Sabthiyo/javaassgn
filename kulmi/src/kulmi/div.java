package kulmi;
import java.util.Scanner;
public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter a number
	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();

	        // Check if the number is divisible by 0-9
	        for (int i = 0; i <= 9; i++) {
	            if (number % i == 0) {
	                // Check if the number ends with a 0 or 5
	                if (number % 10 == 0 || number % 5 == 0) {
	                    System.out.println("The number is divisible by " + i + " because it ends with a 0 or 5");
	                } else {
	                    System.out.println("The number is divisible by " + i);
	                }
	            }
	}

	}
