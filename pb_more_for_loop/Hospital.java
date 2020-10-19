package pb_more_for_loop;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int doctor = 7;
		int totalCheck = 0;
		int totalUncheck = 0;
		
		for (int i = 1; i <= days; i++) {
			int numForDay = Integer.parseInt(scan.nextLine());
			if ((i % 3) == 0 && (totalCheck < totalUncheck)) {
				doctor++;
			}
			if (numForDay <= doctor) {
				totalCheck += numForDay;
			}else {
				totalCheck += doctor;
				totalUncheck += (numForDay - doctor);
			}
			
			
		}
		
		System.out.printf("Treated patients: %d.\n", totalCheck);
		System.out.printf("Untreated patients: %d.", totalUncheck);
		scan.close();

	}

}
