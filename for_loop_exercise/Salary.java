package for_loop_exercise;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int salary = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < count; i++) {
			String web = scan.nextLine();
			if (web.equals("Facebook")) {
				salary -= 150;
			}else if (web.equals("Instagram")) {
				salary -= 100;
			}else if (web.equals("Reddit")) {
				salary -= 50;
			}
			if (salary <= 0) {
				break;
			}
		}
		
		if (salary <= 0) {
			System.out.println("You have lost your salary.");
		} else {
			System.out.printf("%d", salary);
		}
		scan.close();
		
	}

}
