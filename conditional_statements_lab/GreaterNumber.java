package conditional_statements_lab;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		int num2 = Integer.parseInt(scan.nextLine());
		
		if (num1 > num2) {
			System.out.printf("%d", num1);
		} else {
			System.out.printf("%d", num2);
		}
		scan.close();

	}

}
