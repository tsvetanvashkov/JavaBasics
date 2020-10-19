package while_loop_exercise;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lenght = Integer.parseInt(scan.nextLine());
		int width = Integer.parseInt(scan.nextLine());
		int cake = lenght * width;
		
		while (cake > 0) {
			String piece = scan.nextLine();
			if (piece.equals("STOP")) {
				break;
			}
			cake -= Integer.parseInt(piece);
			
		}
		
		if (cake < 0) {
			System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
		} else {
			System.out.printf("%d pieces are left.", cake);
		}
		scan.close();

	}

}
