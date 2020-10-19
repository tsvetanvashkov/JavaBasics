package pb_more_for_loop;

import java.util.Scanner;

public class FootballLeague {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int capacity = Integer.parseInt(scan.nextLine());
		int fans = Integer.parseInt(scan.nextLine());
		double a = 0;
		double b = 0;
		double v = 0;
		double g = 0;
		
//		if (fans > capacity) {
//			fans = capacity;
//		}
		
		for (int i = 1; i <= fans; i++) {
			String sector = scan.nextLine();
			
			if (sector.equals("A")) {
				a++;
			}else if (sector.equals("B")) {
				b++;
			}else if (sector.equals("V")) {
				v++;
			}else if (sector.equals("G")) {
				g++;
			}
		}
		
		System.out.printf("%.2f%%\n", ((a / fans)*100));
		System.out.printf("%.2f%%\n", ((b / fans)*100));
		System.out.printf("%.2f%%\n", ((v / fans)*100));
		System.out.printf("%.2f%%\n", ((g / fans)*100));
		System.out.printf("%.2f%%", ((fans*1.0 / capacity)*100));
		scan.close();

	}

}
