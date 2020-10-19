package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Volleyball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String year = scan.nextLine();
		int p = Integer.parseInt(scan.nextLine());
		int h = Integer.parseInt(scan.nextLine());
		
		double playSofiq = (48 - h) * (3.0 / 4);
		double holiday = p *(2.0 / 3);
		
		double daysPlay = playSofiq + holiday + h;
		
		if (year.equals("leap")) {
			daysPlay *= (1 + 0.15);
			System.out.printf("%.0f", Math.floor(daysPlay));
		}else if (year.equals("normal")) {
			System.out.printf("%.0f", Math.floor(daysPlay));
		}
		scan.close();
		
	}
}