package quiz2;
import java.util.Scanner;
public class sem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	        try (Scanner scanner = new Scanner(System.in)) {
				// Ask the user to enter the marks of the five units
				System.out.println("Enter the marks of the five units:");
				float mark1 = scanner.nextFloat();
				float mark2 = scanner.nextFloat();
				float mark3 = scanner.nextFloat();
				float mark4 = scanner.nextFloat();
				float mark5 = scanner.nextFloat();

				// Calculate the total marks
				float totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;

				// Calculate the average marks
				float averageMarks = totalMarks / 5;

				// Round the average marks to two decimal places
				averageMarks = Math.round(averageMarks * 100) / 100;

				// Display the average marks on the screen
				System.out.println("The average marks are: " + averageMarks);
			}
		}

	
	}


