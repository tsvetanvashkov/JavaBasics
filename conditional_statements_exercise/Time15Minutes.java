package conditional_statements_exercise;

import java.util.Scanner;

public class Time15Minutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = Integer.parseInt(scan.nextLine());
		int min = Integer.parseInt(scan.nextLine());
		
		min += 15;
		
		if (min >= 60) {
			min -= 60;
			hour++;
			if (hour == 24) {
				hour -= 24;
			}
		}
		System.out.printf("%d:%02d", hour, min);
		scan.close();

	}

}
