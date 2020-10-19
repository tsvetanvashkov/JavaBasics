package pb_more_simple_operations;

import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double heightHous = Double.parseDouble(scan.nextLine());
		double lengthHous = Double.parseDouble(scan.nextLine());
		double heighRoof = Double.parseDouble(scan.nextLine());
		
		double backWall = heightHous*heightHous;
		double frontWall = backWall-(1.2 * 2);
		double sideWall = (heightHous * lengthHous)-(1.5*1.5);
		double frontRoof = (heightHous * heighRoof)/2;
		//double sideRoof = Math.sqrt((heighRoof*heighRoof)+((heightHous/2)*(heightHous/2)))*lengthHous;
		double sideRoof = lengthHous * heightHous;
		
		
		double greenLiters = (backWall + frontWall + 2*sideWall)/3.4;
		double redLiters = (2*frontRoof + 2*sideRoof)/4.3;
		
		System.out.printf("%.2f\n", greenLiters);
		System.out.printf("%.2f", redLiters);
		scan.close();

	}

}
