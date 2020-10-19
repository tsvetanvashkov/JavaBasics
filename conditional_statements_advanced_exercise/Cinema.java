package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ticket = scan.nextLine();
		int row = Integer.parseInt(scan.nextLine());
		int column =  Integer.parseInt(scan.nextLine());
		
		double places = (row * column);
		
		if (ticket.equals("Premiere")) {
			places *= 12;
		}else if (ticket.equals("Normal")) {
			places *= 7.5;
		}else if (ticket.equals("Discount")) {
			places *= 5;
		}
		
		System.out.printf("%.2f leva", places);
		scan.close();
		
	}

}
