package while_loop_exercise;

import java.util.Scanner;

public class Walking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stepsSum = 0;
		int goal = 10000;
		
		while (stepsSum < goal) {
			String steps = scan.nextLine();
			if (steps.equals("Going home")) {
				stepsSum += Integer.parseInt(scan.nextLine());
				
				break;
			}
			stepsSum += Integer.parseInt(steps); 
			
		}
		
		if (stepsSum < goal) {
			System.out.printf("%d more steps to reach goal.", (goal - stepsSum ));
		} else {
			System.out.printf("Goal reached! Good job!\n%d steps over the goal!", (stepsSum - goal));
		}		
		scan.close();

	}

}
