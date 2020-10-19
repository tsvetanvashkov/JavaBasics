package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class MultiplyBy2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = 0;
		
		while ((num = Double.parseDouble(scan.nextLine())) >= 0) {
			num *= 2;
			System.out.printf("Result: %.2f\n", num);
		}
		
		System.out.println("Negative number!");
		scan.close();
			
	}

}
