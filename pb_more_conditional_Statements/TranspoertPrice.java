package pb_more_conditional_Statements;

import java.util.Scanner;

public class TranspoertPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km = Integer.parseInt(scan.nextLine());
		String time = scan.nextLine();
		double price = 0;
		
		if (km < 20) {
			price = 0.7;
			if(time.equals("day")) {
				price += 0.79*km;
			}else if (time.equals("night")) {
				price += 0.9*km;
			}
		}else if(20 <= km && km < 100){
			price = 0.09*km;
		}else if (100 <= km) {
			price = 0.06*km;
		}
		
		System.out.printf("%.2f", price);
		scan.close();

	}

}
