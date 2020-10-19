package pb_more_nasted_loops;

import java.util.Scanner;

public class WeddingSeats {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sector = scan.nextLine();
		int row = Integer.parseInt(scan.nextLine());
		int seats = Integer.parseInt(scan.nextLine());
		int count = 0;
		char s = sector.charAt(0);
		
		for (int i = 'A'; i <= s; i++, row++) {
			for (int j = 1; j <= row; j++) {
				if ((j % 2) == 0) {
					for (int j2 = 'a'; j2 < ('a' + (seats + 2)); j2++) {
						System.out.printf("%c%d%c\n", i, j, j2);
						count++;
					}
				}else {
					for (int j2 = 'a'; j2 < ('a' + seats); j2++) {
						System.out.printf("%c%d%c\n", i, j, j2);
						count++;
					}
				}
				
			}
		}
		System.out.println(count);
		scan.close();

	}

}
