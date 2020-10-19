package conditional_statements_exercise;

import java.util.Scanner;

public class Scholarship {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double income = Double.parseDouble(scan.nextLine());
		double success = Double.parseDouble(scan.nextLine());
		double min = Double.parseDouble(scan.nextLine());
		int socialScholarshipC = 0;
		int successScholarshipC = 0;
		double socialScholarship = 0;
		double successScholarshep = 0;
		
		if ((income < min) && (success > 4.5)) {
			socialScholarshipC++;
			socialScholarship = min * 0.35;
		}
		if (success >= 5.5) {
			successScholarshipC++;
			successScholarshep = success * 25;
		}
		
		if ((socialScholarshipC != 0) && (socialScholarship > successScholarshep)) {
			System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
		}else if ((successScholarshipC != 0) && (successScholarshep >= socialScholarship)) {
			System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarshep));
		}else {
			System.out.println("You cannot get a scholarship!");
		}
		scan.close();

	}

}
