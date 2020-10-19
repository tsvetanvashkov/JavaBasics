package nested_loops_lab;

import java.util.Scanner;

public class CinemaTickets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = 0;
		int standard = 0;
		int kid = 0;
		int ticketAll = 0;
		
		
		while (true) {
			String movie = scan.nextLine();
			if (movie.equals("Finish")) {
				break;
			}
			int ticketMovie = 0;
			int place = Integer.parseInt(scan.nextLine());
			for (int i = 1; i <= place; i++) {
				String ticket = scan.nextLine();
				if (ticket.equals("End")) {
					break;
				}else if (ticket.equals("student")) {
					student++;
					ticketMovie++;
				}else if (ticket.equals("standard")) {
					standard++;
					ticketMovie++;
				}else if (ticket.equals("kid")) {
					kid++;
					ticketMovie++;
				}
				
			}
			ticketAll += ticketMovie;
			System.out.printf("%s - %.2f%% full.\n", movie, ((ticketMovie*1.0) / place)*100);
			
		}
		System.out.printf("Total tickets: %d\n", ticketAll);
		System.out.printf("%.2f%% student tickets.\n", ((student*1.0) / ticketAll)*100);
		System.out.printf("%.2f%% standard tickets.\n", ((standard*1.0) / ticketAll)*100);
		System.out.printf("%.2f%% kids tickets.\n", ((kid*1.0) / ticketAll)*100);
		scan.close();
		
	}

}
