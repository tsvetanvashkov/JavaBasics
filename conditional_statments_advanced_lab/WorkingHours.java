package conditional_statments_advanced_lab;

import java.util.Scanner;

public class WorkingHours {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = Integer.parseInt(scan.nextLine());
		String day = scan.nextLine();
		
		if ((10 <= hour) && (hour <= 18)) {
			switch (day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
			case "Saturday":
				System.out.println("open");
				break;
			default:
				System.out.println("closed");
				break;
			}
		}else {
			System.out.println("closed");
		}
		scan.close();

	}

}
