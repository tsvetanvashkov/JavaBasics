package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class PointOnReectangleBorder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = Double.parseDouble(scan.nextLine());
		double y1 = Double.parseDouble(scan.nextLine());
		double x2 = Double.parseDouble(scan.nextLine());
		double y2 = Double.parseDouble(scan.nextLine());
		double x = Double.parseDouble(scan.nextLine());
		double y = Double.parseDouble(scan.nextLine());
		String result = "";
		
		if (((x == x1) || (x == x2)) && ((y >= y1) && (y <= y2)) || ((y == y1) || (y == y2)) && ((x >= x1) && (x <= x2))) {
			result = "Border";
		}else {
			result = "Inside / Outside";
		}
		
		System.out.println(result);
		scan.close();

	}

}
