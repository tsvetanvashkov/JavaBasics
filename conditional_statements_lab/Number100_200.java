package conditional_statements_lab;

import java.util.Scanner;

public class Number100_200 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		if (num < 100) {
			System.out.println("Less than 100");
		}else if (100 <= num && num <= 200) {
			System.out.println("Between 100 and 200");
		}else {
			System.out.println("Greater than 200");
		}
		scan.close();

	}

}
