package nasted_loops_exercise;

import java.util.Scanner;

public class TrainTheTrainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int people = Integer.parseInt(scan.nextLine());
		String presentation = scan.nextLine();
		double assessment = 0;
		int count = 0;
		
		
		while (!presentation.equals("Finish")) {
			double sumPresentation = 0;
			double average = 0;
			for (int i = 1; i <= people; i++) {
				sumPresentation += Double.parseDouble(scan.nextLine());
			}
			average = sumPresentation / people;
			System.out.printf("%s - %.2f.\n", presentation, average);
			assessment += average;
			count++;
			presentation = scan.nextLine();
			
		}
		System.out.printf("Student's final assessment is %.2f.\n", (assessment / count));
		scan.close();

	}

}
