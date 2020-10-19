package first_steps_in_coding_exercise;

import java.util.Scanner;

public class VacationBooksList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sheetNum = Integer.parseInt(scan.nextLine());
		int sheetPerHour = Integer.parseInt(scan.nextLine());
		int days = Integer.parseInt(scan.nextLine());
		int hoursPerDay = (sheetNum / sheetPerHour) / days;
		System.out.println(hoursPerDay);
		scan.close();
		
	}

}
