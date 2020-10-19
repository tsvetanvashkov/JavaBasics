package pb_more_simple_operations;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = Double.parseDouble(scan.nextLine());
		double h = Double.parseDouble(scan.nextLine());
		double area = a*(h/2);
		System.out.printf("%.2f", area);
		scan.close();

	}

}
