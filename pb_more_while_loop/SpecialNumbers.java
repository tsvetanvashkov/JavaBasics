package pb_more_while_loop;

import java.util.Scanner;

public class SpecialNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		for (int i = 1111; i < 10000; i++) {
			int count = 0;
			String number = "" + i;
			for (int j = 0; j < number.length(); j++) {
				int digit = Integer.parseInt("" + number.charAt(j));
				if (digit == 0) {
					break;
				}
				if ((num % digit) == 0) {
					count++;
				}else {
					break;
				}
			}
			if (count == 4) {
				System.out.print(number + " ");
			}
		}
		scan.close();

	}

}
