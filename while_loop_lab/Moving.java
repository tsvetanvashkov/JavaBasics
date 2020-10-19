package while_loop_lab;

import java.util.Scanner;

public class Moving {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width = Integer.parseInt(scan.nextLine());
		int lengh = Integer.parseInt(scan.nextLine());
		int hight = Integer.parseInt(scan.nextLine());
		int freeSpace = width * lengh * hight;
		String num = scan.nextLine();
		int occupiedSpace = 0;
		
		while (!num.equals("Done")) {
			occupiedSpace += Integer.parseInt(num);
			if (occupiedSpace > freeSpace) {
				break;
			}
			num = scan.nextLine();
		}
		
		if (occupiedSpace > freeSpace) {
			System.out.printf("No more free space! You need %d Cubic meters more.", (occupiedSpace - freeSpace));
		}else {
			System.out.printf("%d Cubic meters left.", (freeSpace - occupiedSpace));
		}
		scan.close();

	}

}
