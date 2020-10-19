package pb_more_conditional_Statements;

import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hoursNeeded = Integer.parseInt(scan.nextLine());
		int days = Integer.parseInt(scan.nextLine());
		int workers = Integer.parseInt(scan.nextLine());
		
		double hours = (days*(1 - 0.1))*8;
		double overtime = workers*days*2;
		hours = Math.floor(hours+overtime);
		
		if (hoursNeeded <= hours) {
			System.out.printf("Yes!%d hours left.", (int)(hours-hoursNeeded));
		} else {
			System.out.printf("Not enough time!%d hours needed.", (int)(hoursNeeded-hours));
		}
		scan.close();
		
	}

}
