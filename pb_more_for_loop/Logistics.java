package pb_more_for_loop;

import java.util.Scanner;

public class Logistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCargo = Integer.parseInt(scan.nextLine());
		int tons = 0;
		double price = 0;
		double bus = 0;
		double truck = 0;
		double train = 0;
		
		for (int i = 1; i <= numCargo; i++) {
			int cargo = Integer.parseInt(scan.nextLine());
			if (cargo <= 3) {
				bus = bus + cargo;
			}else if ((4 <= cargo) && (cargo <= 11)) {
				truck = truck + cargo;
			}else if (12 <= cargo){
				train = train + cargo;
			}
			tons += cargo;
			
		}
		
		price = ((bus*200) + (truck*175) + (train*120))/tons;
		
		System.out.printf("%.2f\n", price);
		System.out.printf("%.2f%%\n", ((bus / tons)*100));
		System.out.printf("%.2f%%\n", ((truck / tons)*100));
		System.out.printf("%.2f%%", ((train / tons)*100));
		scan.close();

	}

}
