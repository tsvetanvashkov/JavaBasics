package pb_more_while_loop;

import java.util.Scanner;

public class Dishwasher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numBottle = Integer.parseInt(scan.nextLine());
		int detergent = numBottle * 750;
		int count = 1; 
		boolean fail = true;
		int sumPlate = 0;
		int sumSaucepan = 0;
		
		while (detergent >= 0) {
			String dish = scan.nextLine();
			if (dish.equals("End")) {
				fail = false;
				break;
			}
			if (count == 3) {
				int saucepan = Integer.parseInt(dish);
				detergent -= (saucepan * 15);
				sumSaucepan += saucepan;
				count = 1;
			} else {
				int plate = Integer.parseInt(dish);
				detergent -= (plate * 5);
				sumPlate += plate;
				count++;
			}
			
		}
		
		if (fail) {
			System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
		} else {
			System.out.printf("Detergent was enough!\n" + "%d dishes and %d pots were washed.\n" +
					"Leftover detergent %d ml.", sumPlate, sumSaucepan, detergent);
		}
		scan.close();
		
	}

}
