package while_loop_exercise;

import java.util.Scanner;

public class ExamPreparation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fails = Integer.parseInt(scan.nextLine());
		int numberOfProblems = 0;
		double sumGrade = 0;
		boolean fail = true;
		int numFails = 0;
		String lastProblem = "";
		
		
		while (numFails < fails) {
			String nameProblem = scan.nextLine();
			if (nameProblem.equals("Enough")) {
				fail = false;
				break;
			}
			int grade = Integer.parseInt(scan.nextLine());
			if (grade <= 4) {
				numFails++;
			}
			sumGrade += grade*1.0;
			numberOfProblems++;
			lastProblem = nameProblem;
			
		}
		
		if (fail) {
			System.out.printf("You need a break, %d poor grades.", fails);
		} else {
			System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", (sumGrade/numberOfProblems), numberOfProblems, lastProblem);
		}
		scan.close();

	}

}
