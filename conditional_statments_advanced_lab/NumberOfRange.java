package conditional_statments_advanced_lab;

import java.util.Scanner;

public class NumberOfRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		if ((-100 <= num) && (num != 0) && (num <= 100)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();

	}

}
