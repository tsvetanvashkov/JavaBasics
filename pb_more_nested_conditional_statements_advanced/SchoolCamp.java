package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class SchoolCamp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String season = scan.nextLine();
		String student = scan.nextLine();
		int numStudents = Integer.parseInt(scan.nextLine());
		int numNights = Integer.parseInt(scan.nextLine());
		double price = 0;
		String sport = "";
		
		if (season.equals("Winter")) {
			if (student.equals("girls")) {
				price = numNights * numStudents * 9.6;
				sport = "Gymnastics";
			}else if (student.equals("boys")) {
				price = numNights * numStudents * 9.6;
				sport = "Judo";
			}else if (student.equals("mixed")) {
				price = numNights * numStudents * 10;
				sport = "Ski";
			}
		}else if (season.equals("Spring")) {
			if (student.equals("girls")) {
				price = numNights * numStudents * 7.2;
				sport = "Athletics";
			}else if (student.equals("boys")) {
				price = numNights * numStudents * 7.2;
				sport = "Tennis";
			}else if (student.equals("mixed")) {
				price = numNights * numStudents * 9.5;
				sport = "Cycling";
			}
		}else if (season.equals("Summer")) {
			if (student.equals("girls")) {
				price = numNights * numStudents * 15;
				sport = "Volleyball";
			}else if (student.equals("boys")) {
				price = numNights * numStudents * 15;
				sport = "Football";
			}else if (student.equals("mixed")) {
				price = numNights * numStudents * 20;
				sport = "Swimming";
			}
		}
		
		if ((10 <= numStudents) && (numStudents < 20)) {
			price *= (1 - 0.05);
		}else if ((20 <= numStudents) && (numStudents < 50)) {
			price *= (1 - 0.15);
		}else if (50 <= numStudents) {
			price *= (1 - 0.5);
		}
		
		System.out.printf("%s %.2f lv.", sport, price);
		scan.close();

	}

}
