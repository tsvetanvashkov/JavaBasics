package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		int num2 =  Integer.parseInt(scan.nextLine());
		String operator = scan.nextLine();
		double number = 0;
		String evenOdd = "";
		
		if (operator.equals("+")) {
			number = num1 + num2;
			if ((number % 2) == 0) {
				evenOdd = "even";
			}else {
				evenOdd = "odd";
			}
			System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, number, evenOdd);
		}else if (operator.equals("-")) {
			number = num1 - num2;
			if ((number % 2) == 0) {
				evenOdd = "even";
			}else {
				evenOdd = "odd";
			}
			System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, number, evenOdd);
		}else if (operator.equals("*")) {
			number = num1 * num2;
			if ((number % 2) == 0) {
				evenOdd = "even";
			}else {
				evenOdd = "odd";
			}
			System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, number, evenOdd);
		}else if (operator.equals("/")) {
			if (num2 == 0) {
				System.out.printf("Cannot divide %d by zero", num1);
			}else {
				number = (double)num1 / (double)num2;
				System.out.printf("%d / %d = %.2f", num1, num2, number);
			}
		}else if (operator.equals("%")) {
			if (num2 == 0) {
				System.out.printf("Cannot divide %d by zero", num1);
			}else {
				number = num1 % num2;
				System.out.printf("%d %% %d = %.0f", num1, num2, number);
			}
		}
	
		scan.close();
		
	}

}
