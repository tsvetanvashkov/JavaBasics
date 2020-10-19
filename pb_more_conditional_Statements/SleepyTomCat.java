package pb_more_conditional_Statements;

import java.util.Scanner;

public class SleepyTomCat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int weekends = Integer.parseInt(scan.nextLine());
		int workDays = 365-weekends;
		int sleepTime = 30000;
		
		int playTime = (weekends * 127)+(workDays * 63); 
		int hour = Math.abs(sleepTime - playTime)/60;
		int min = Math.abs(sleepTime - playTime)%60;
		
		if (playTime <= sleepTime) {
			System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", hour, min);
		} else {
			System.out.printf("Tom will run away\n%d hours and %d minutes more for play", hour, min);
		}
		scan.close();

	}

}
