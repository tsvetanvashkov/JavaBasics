package pb_more_for_loop;

import java.util.Scanner;

public class GameOfIntervals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		double points = 0;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		double invalid = 0;
		
		
		for (int i = 1; i <= count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if ((0 <= num) && (num < 10)) {
				one++;
				points = points + (num * 0.2);
			}else if ((10 <= num) && (num < 20)) {
				two++;
				points = points + (num * 0.3);
			}else if ((20 <= num) && (num < 30)){
				three++;
				points = points + (num * 0.4);
			}else if ((30 <= num) && (num < 40)) {
				four++;
				points = points + 50;
			}else if ((40 <= num) && (num <= 50)) {
				five++;
				points = points + 100;
			}else {
				invalid++;
				points = points / 2;
			}
			
		}
		
		System.out.printf("%.2f\n", points);
		System.out.printf("From 0 to 9: %.2f%%\n", ((one / count)*100));
		System.out.printf("From 10 to 19: %.2f%%\n", ((two / count)*100));
		System.out.printf("From 20 to 29: %.2f%%\n", ((three / count)*100));
		System.out.printf("From 30 to 39: %.2f%%\n", ((four / count)*100));
		System.out.printf("From 40 to 50: %.2f%%\n", ((five / count)*100));
		System.out.printf("Invalid numbers: %.2f%%", ((invalid / count)*100));
		scan.close();

	}

}
