package pb_more_simple_operations;

import java.util.Scanner;

public class TrainingLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double w = Double.parseDouble(scan.nextLine());
		double h = Double.parseDouble(scan.nextLine());
		scan.close();

		//if(h<=3||w<=h||100<=w) {
		//	System.out.println("Bed input!");
		//	return;
		//}
		h--;
		int numberWorkSpace = ((int)(w/1.2)*(int)(h/0.7)) - 3;
		System.out.println(numberWorkSpace);

	}

}
