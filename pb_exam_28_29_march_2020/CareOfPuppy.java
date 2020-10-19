package pb_exam_28_29_march_2020;

import java.util.Scanner;

public class CareOfPuppy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalFood = Integer.parseInt(scan.nextLine());
		String food = scan.nextLine();
		int sum = 0;
		totalFood *= 1000; 
		
		while (!food.equals("Adopted")) {
			int gram = Integer.parseInt(food);
			sum += gram;
			
			food = scan.nextLine();
		}
		
		if (totalFood >= sum) {
			System.out.printf("Food is enough! Leftovers: %d grams.", (totalFood - sum));
		} else {
			System.out.printf("Food is not enough. You need %d grams more.", (sum - totalFood));
		}
		scan.close();

	}

}
