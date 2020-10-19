package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class OnTimeForTheExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hourExam = Integer.parseInt(scan.nextLine());
		int minExam =  Integer.parseInt(scan.nextLine());
		int hourArive = Integer.parseInt(scan.nextLine());
		int minArive =  Integer.parseInt(scan.nextLine());
		
		int timeExam = (hourExam * 60) + minExam;
		int timeArive = (hourArive *60) + minArive;
		int difference = Math.abs(timeExam - timeArive);
		
		if (timeExam < timeArive) {
			System.out.println("Late");
			if (difference < 60) {
				System.out.printf("%d minutes after the start", difference);
			} else {
				System.out.printf("%d:%02d hours after the start", (difference / 60), (difference % 60));
			}
		}else if ((timeArive <= timeExam) && (timeArive >= (timeExam - 30))) {
			System.out.println("On time");
			if (difference != 0) {
				System.out.printf("%d minutes before the start", difference);
			}
		}else if (timeArive < (timeExam - 30)) {
			System.out.println("Early");
			if (difference < 60) {
				System.out.printf("%d minutes before the start", difference);
			} else {
				System.out.printf("%d:%02d hours before the start", (difference / 60), (difference % 60));
			}
		}
		scan.close();

	}

}
