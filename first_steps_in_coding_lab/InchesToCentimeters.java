package first_steps_in_coding_lab;

import java.util.Scanner;

public class InchesToCentimeters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inch = scan.nextDouble();
		double sm = inch * 2.54;
		System.out.println(sm);
		scan.close();

	}

}
