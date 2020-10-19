package pb_more_for_loop;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int students = Integer.parseInt(scan.nextLine());
		double average = 0;
		double allGrade = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		
		
		for (int i = 1; i <= students; i++) {
			double grade = Double.parseDouble(scan.nextLine());
			if ((2 <= grade) && (grade < 3)) {
				two++;
			}else if ((3 <= grade) && (grade < 4)) {
				three++;
			}else if ((4 <= grade) && (grade < 5)){
				four++;
			}else if (5 <= grade) {
				five++;
			}
			allGrade = allGrade + grade;
			
		}
		
		average = allGrade/students;
		
		System.out.printf("Top students: %.2f%%\n", ((five / students)*100));
		System.out.printf("Between 4.00 and 4.99: %.2f%%\n", ((four / students)*100));
		System.out.printf("Between 3.00 and 3.99: %.2f%%\n", ((three / students)*100));
		System.out.printf("Fail: %.2f%%\n", ((two / students)*100));
		System.out.printf("Average: %.2f", average);
		scan.close();

	}

}
