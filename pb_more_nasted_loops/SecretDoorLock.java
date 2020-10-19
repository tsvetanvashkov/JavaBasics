package pb_more_nasted_loops;

import java.util.Scanner;

public class SecretDoorLock {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNum = Integer.parseInt(scan.nextLine());
		int secondNum = Integer.parseInt(scan.nextLine());
		int thirdNum = Integer.parseInt(scan.nextLine());
		
		if (secondNum > 7) {
			secondNum = 7;
		}
		
		for (int i = 2; i <= firstNum; i++, i++) {
			for (int j = 2; j <= secondNum; j++) {
				if ((j == 4) || (j == 6)) {
					continue;
				}
				for (int j2 = 2; j2 <= thirdNum; j2++, j2++) {
					System.out.printf("%d %d %d\n", i, j, j2);
				}
			}
		}
		scan.close();
		
	}
	
}
