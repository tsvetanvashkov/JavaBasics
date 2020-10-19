package pb_more_simple_operations;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double c = Double.parseDouble(scan.nextLine());
		double f = (c * 1.8)+32;
		System.out.printf("%.2f", f);
		scan.close();
	}

}
