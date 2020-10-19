package while_loop_lab;

import java.util.Scanner;

public class GraduationPt2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int clas = 0;
		double average = 0;
		int excluded = 2;
		
		while (clas < 12) {
			double num = Double.parseDouble(scan.nextLine());
			if (num < 4) {
				excluded--;
			}
			if (excluded == 0) {
				System.out.printf("%s has been excluded at %d grade", name , clas);
				break;
			}
			average += num;
			clas++;
		}
		
		if (excluded != 0) {
			average /= clas;
			System.out.printf("%s graduated. Average grade: %.2f", name, average);
		}
		
		scan.close();

	}

}
