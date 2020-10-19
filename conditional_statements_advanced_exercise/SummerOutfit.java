package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class SummerOutfit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int deg = Integer.parseInt(scan.nextLine());
		String time = scan.nextLine();
		String outfit = "";
		String shoes = "";
		
		if ((10 <= deg) && (deg <= 18)) {
			if (time.equals("Morning")) {
				outfit = "Sweatshirt";
				shoes = "Sneakers";
			}else if (time.equals("Afternoon") || time.equals("Evening")) {
				outfit = "Shirt";
				shoes = "Moccasins";
			}
		}else if ((18 < deg) && (deg <= 24)) {
			if (time.equals("Morning") || time.equals("Evening")) {
				outfit = "Shirt";
				shoes = "Moccasins";
			}else if (time.equals("Afternoon")) {
				outfit = "T-Shirt";
				shoes = "Sandals";
			}
		}else if (25 <= deg) {
			if (time.equals("Morning")) {
				outfit = "T-Shirt";
				shoes = "Sandals";
			}else if (time.equals("Afternoon")) {
				outfit = "Swim Suit";
				shoes = "Barefoot";
			}else if (time.equals("Evening")) {
				outfit = "Shirt";
				shoes = "Moccasins";
			}
		}
		
		System.out.printf("It's %d degrees, get your %s and %s.",  deg, outfit, shoes);
		scan.close();

	}

}
