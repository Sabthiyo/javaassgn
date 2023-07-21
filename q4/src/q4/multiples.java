package q4;
import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();

	    if (num <= 70) {
	      System.out.print(num + " is not a multiple of 2, 3, or 7.\n");
	    } else {
	      int multiple = 0;
	      for (int i = 2; i <= num / 7; i++) {
	        multiple += i;
	      }
	      System.out.print(num + " is a multiple of " + multiple + ".\n");
	    }
	}

}
