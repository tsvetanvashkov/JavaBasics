package conditional_statements_lab;

import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String figure = scan.nextLine();
		String square = "square";
		String rectangle = "rectangle";
		String circle = "circle";
		String triangle = "triangle";
		
		if (figure.equals(square)) {
			double side = Double.parseDouble(scan.nextLine());
			double area = side * side;
			System.out.printf("%.3f", area);
		}else if (figure.equals(rectangle)) {
			double side1 = Double.parseDouble(scan.nextLine());
			double side2 = Double.parseDouble(scan.nextLine());
			double area = side1 * side2;
			System.out.printf("%.3f", area);
		}else if (figure.equals(circle)) {
			double radius = Double.parseDouble(scan.nextLine());
			double area = Math.PI * radius * radius;
			System.out.printf("%.3f", area);
		}else if (figure.equals(triangle)) {
			double side = Double.parseDouble(scan.nextLine());
			double hight = Double.parseDouble(scan.nextLine());
			double area = (side * hight)/2;
			System.out.printf("%.3f", area);
		}
		scan.close();

	}

}
