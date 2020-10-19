package pb_more_conditional_Statements;

import java.util.Scanner;

public class PipesInPool {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int volume = Integer.parseInt(scan.nextLine());
		int pipe1 = Integer.parseInt(scan.nextLine());
		int pipe2 = Integer.parseInt(scan.nextLine());
		double hours = Double.parseDouble(scan.nextLine());
		
		double flowPipe1 = pipe1*hours;
		double flowPipe2 = pipe2*hours;
		double filled = flowPipe1+flowPipe2;
		
		 if (filled <= volume) {
			double percentPipe1 = (flowPipe1/filled)*100;
			double percentPipe2 = (flowPipe2/filled)*100;
			double percentfilled = (filled/volume)*100;
			System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentfilled, percentPipe1, percentPipe2);
			 
		} else {
			double overflow = filled-volume;
			System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflow);
		}
		scan.close();

	}

}
