package pb_more_nasted_loops;

import java.util.Scanner;

public class SafePasswordsGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int max = Integer.parseInt(scan.nextLine());
		int first = 35;
		int second = 64;
		int count = 0;
		scan.close();

		for (int j = 1; j <= a; j++) {
			for (int j2 = 1; j2 <= b; j2++, first++, second++) {
				System.out.printf("%c%c%d%d%c%c|", first, second, j, j2, second, first);
				count++;
				if (first == 55) {
					first = 34;
				}
				if (second == 96) {
					second = 63;
				}
				if (count == max) {
					return;
				}
			}
		}	
		
	}

}
