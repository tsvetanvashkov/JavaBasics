package conditional_statments_advanced_lab;

import java.util.Scanner;

public class InvalidNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		if (((num < 100) || (200 < num)) && (num != 0)) {
			System.out.println("invalid");
		}
		scan.close();

	}

}
